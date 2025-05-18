package com.AnunciosLoc.AnunciosLoc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AnunciosLoc.AnunciosLoc.bd.anuncio.AnuncioRepository;
import com.AnunciosLoc.AnunciosLoc.bd.local.Local;
import com.AnunciosLoc.AnunciosLoc.bd.local.LocalRepository;
import com.AnunciosLoc.AnunciosLoc.bd.user.User;
import com.AnunciosLoc.AnunciosLoc.bd.user.UserRepository;
import com.AnunciosLoc.AnunciosLoc.bd.anuncio.Anuncio;
import xml.soap.anuncios.*;

@Service
public class AnunciosService {

    @Autowired
    private final AnuncioRepository anuncioRepository;
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final LocalRepository localizacaoRepository;

    public AnunciosService(
            AnuncioRepository anuncioRepository,
            UserRepository userRepository,
            LocalRepository localizacaoRepository) {
        this.anuncioRepository = anuncioRepository;
        this.userRepository = userRepository;
        this.localizacaoRepository = localizacaoRepository;
    }

    public AddAnuncioResponse addAnuncio(AddAnuncioRequest request) {
        AddAnuncioResponse response = new AddAnuncioResponse();

        try {
            Anuncio anuncio = new Anuncio();
            anuncio.setTitulo(request.getBody().getTitulo());

            // anuncio.setBloquear(request.getBody().getBloquear());
            anuncio.setDescricao(request.getBody().getDescricao());
            anuncio.setDataexpiracao(request.getBody().getDataexpiracao());

            anuncio.setBloquear("false"); // evitar o erro
            anuncioRepository.save(anuncio);

            // Captura e associa User e Local
            Long userId = request.getBody().getUserId(); // ou getIdUser(), getIdUsuario(), etc.
            Long localId = request.getBody().getLocalId(); // ou getIdLocal(), etc.

            // ...
            Optional<User> userOpt = userRepository.findById(userId);
            Optional<Local> localOpt = localizacaoRepository.findById(localId);

            if (!userOpt.isPresent() || !localOpt.isPresent()) {
                response.setMensagem("Usuário ou Localização não encontrados.");
                response.setStatus(false);
                return response;
            }

            anuncio.setUser(userOpt.get());
            anuncio.setLocalizacao(localOpt.get());

            anuncioRepository.save(anuncio);
            response.setMensagem("Anúncio publicado com sucesso.");
            response.setStatus(true);
            response.setUserId(userId.intValue());
            response.setLocalId(localId.intValue());

        } catch (Exception e) {
            response.setMensagem("Erro ao publicar o anúncio: " + e.getMessage());
            response.setStatus(false);
        }

        return response;
    }

    public AllAnuncioResponse getAllAnuncios(AllAnuncioRequest request) {
        AllAnuncioResponse response = new AllAnuncioResponse();

        try {
            List<Anuncio> anuncios = anuncioRepository.findAll();

            if (anuncios.isEmpty()) {
                response.setMensagem("Nenhum anúncio encontrado.");
                response.setEstado(false);
                return response;
            }

            for (Anuncio anuncio : anuncios) {
                AnuncioType item = new AnuncioType();
                item.setId(anuncio.getId().intValue());
                item.setTitulo(anuncio.getTitulo());
                item.setDescricao(anuncio.getDescricao());
                item.setDataexpiracao(anuncio.getDataexpiracao().toString());

                // --- User ---
                User user = anuncio.getUser();
                if (user != null) {
                    UserType userType = new UserType();
                    userType.setId(user.getId().intValue());
                    userType.setNome(user.getUsername()); // ou user.getName()
                    userType.setEmail(user.getEmail());
                    // adicione outros campos conforme sua definição do UserType

                    item.setUsuario(userType);
                }

                // --- Localização ---
                Local local = anuncio.getLocalizacao();
                if (local != null) {
                    LocalType localType = new LocalType();
                    localType.setId(local.getId().intValue());
                    localType.setNome(local.getNome()); // ou local.getDescricao()
                    localType.setLatitude(local.getLatitude());
                    localType.setLongitude(local.getLongitude());
                    // adicione outros campos conforme sua definição do LocalType

                    item.setLocal(localType);
                }

                response.getAnuncios().add(item);
            }

            response.setMensagem("Anúncios listados com sucesso.");
            response.setEstado(true);

        } catch (Exception e) {
            response.setMensagem("Erro ao listar os anúncios: " + e.getMessage());
            response.setEstado(false);
        }

        return response;
    }

    public RemoveAnuncioResponse removeAnuncio(RemoveAnuncioRequest request) {
        RemoveAnuncioResponse response = new RemoveAnuncioResponse();

        long anuncioId = request.getBody().getId();
        long userId = request.getBody().getUserId();

        Optional<Anuncio> anuncioOptional = anuncioRepository.findById(anuncioId);

        if (anuncioOptional.isPresent()) {
            Anuncio anuncio = anuncioOptional.get();

            if (anuncio.getUser().getId() == userId) {
                anuncioRepository.delete(anuncio);
                response.setMensagem("Anúncio removido com sucesso!");
                response.setStatus(true);
            } else {
                response.setMensagem("Você não tem permissão para remover este anúncio.");
                response.setStatus(false);
            }
        } else {
            response.setMensagem("Anúncio não encontrado.");
            response.setStatus(false);
        }

        return response;
    }

}
