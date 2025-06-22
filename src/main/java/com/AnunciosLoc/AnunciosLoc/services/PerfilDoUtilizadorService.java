package com.AnunciosLoc.AnunciosLoc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnunciosLoc.AnunciosLoc.bd.perfilDoUtilizador.PerfilDoUtlizador;
import com.AnunciosLoc.AnunciosLoc.bd.perfilDoUtilizador.PerfilDoUtlizadorRepository;
import com.AnunciosLoc.AnunciosLoc.bd.utilizador.Utilizador;
import com.AnunciosLoc.AnunciosLoc.bd.utilizador.UtilizadorRepository;

import xml.soap.user.EditUserProfileRequest;
import xml.soap.user.EditUserProfileResponse;
import xml.soap.user.InteresseType;
import xml.soap.user.ListarPerfilRequest;
import xml.soap.user.ListarPerfilResponse;
import xml.soap.user.ParChaveValorType;
import xml.soap.user.RemoveUserProfileRequest;
import xml.soap.user.RemoveUserProfileResponse;

@Service
public class PerfilDoUtilizadorService {

    @Autowired
    private PerfilDoUtlizadorRepository perfilDoUtilizadorRepository;

    @Autowired
    private UtilizadorRepository userRepository;
 
    public PerfilDoUtilizadorService(UtilizadorRepository userRepository, PerfilDoUtlizadorRepository perfilDoUtilizadorRepository) {
        this.userRepository = userRepository;
        this.perfilDoUtilizadorRepository = perfilDoUtilizadorRepository;
    }

    public void addProfile(String usuarioId, List<InteresseType> interesses) {
        Optional<Utilizador> optionalUser = userRepository.findById(Long.valueOf(usuarioId));

        if (!optionalUser.isPresent()) {
            throw new RuntimeException("Usuário não encontrado com o ID: " + usuarioId);
        }

        Utilizador user = optionalUser.get();

        // Buscar todos os interesses atuais do usuário
        List<PerfilDoUtlizador> interessesExistentes = perfilDoUtilizadorRepository.findByUser(user);

        for (InteresseType interesse : interesses) {
            String nomeInteresse = interesse.getNome();

            // Verifica se o interesse já existe
            Optional<PerfilDoUtlizador> interesseExistente = interessesExistentes.stream()
                    .filter(i -> i.getChave().equals("interesse") && i.getValor().equalsIgnoreCase(nomeInteresse))
                    .findFirst();

            if (interesse.isSelecionado()) {
                // Se estiver selecionado e não existir, adicionar
                if (!interesseExistente.isPresent()) {
                    PerfilDoUtlizador profile = new PerfilDoUtlizador();
                    profile.setUser(user);
                    profile.setChave("interesse");
                    profile.setValor(nomeInteresse);
                    perfilDoUtilizadorRepository.save(profile);
                }
                // Se já existe e está selecionado, não faz nada (já está certo)
            } else {
                // Se não está selecionado e já existe, apagar
                interesseExistente.ifPresent(perfilDoUtilizadorRepository::delete);
            }
        }
    }

    public EditUserProfileResponse editProfile(EditUserProfileRequest request) {
        EditUserProfileResponse response = new EditUserProfileResponse();

        try {
            // Busca o usuário
            Optional<Utilizador> userOptional = userRepository.findById(request.getBody().getUserId());
            if (!userOptional.isPresent()) {
                response.setMensagem("Usuário não encontrado.");
                response.setStatus(false);
                return response;
            }
            Utilizador user = userOptional.get();

            // Busca o par chave-valor antigo do utilizador
            Optional<PerfilDoUtlizador> perfilOptional = perfilDoUtilizadorRepository.findByUserAndChave(user,
                    request.getBody().getChaveAntiga());

            if (!perfilOptional.isPresent()) {
                response.setMensagem("Par chave-valor não encontrado.");
                response.setStatus(false);
                return response;
            }

            PerfilDoUtlizador perfil = perfilOptional.get();

            // Verifica o que deve ser atualizado
            String chaveNova = request.getBody().getNovaChaver() != null ? request.getBody().getNovaChaver()
                    : request.getBody().getChaveAntiga();
            String valorNovo = request.getBody().getNovoValor() != null ? request.getBody().getNovoValor()
                    : perfil.getValor();

            // Valida duplicação de chave (se a chave foi alterada)
            if (!chaveNova.equals(request.getBody().getChaveAntiga())) {
                boolean chaveJaExiste = perfilDoUtilizadorRepository.findByUserAndChave(user, chaveNova).isPresent();
                if (chaveJaExiste) {
                    response.setMensagem("A nova chave já existe no perfil do utilizador.");
                    response.setStatus(false);
                    return response;
                }
            }

            // Atualiza o perfil
            perfil.setChave(chaveNova);
            perfil.setValor(valorNovo);
            perfilDoUtilizadorRepository.save(perfil);

            response.setMensagem("Perfil atualizado com sucesso.");
            response.setStatus(true);

        } catch (Exception e) {
            response.setMensagem("Erro ao atualizar perfil: " + e.getMessage());
            response.setStatus(false);
        }

        return response;
    }

    public RemoveUserProfileResponse removeProfile(RemoveUserProfileRequest request) {
        RemoveUserProfileResponse response = new RemoveUserProfileResponse();

        try {
            // Buscar o usuário
            Optional<Utilizador> userOptional = userRepository.findById(request.getBody().getUserId());

            if (!userOptional.isPresent()) {
                response.setMensagem("Usuário não encontrado.");
                response.setStatus(false);
                return response;
            }

            Utilizador user = userOptional.get();

            // Buscar o par chave-valor
            Optional<PerfilDoUtlizador> perfilOptional = perfilDoUtilizadorRepository.findByUserAndChave(user,
                    request.getBody().getChave());

            if (!perfilOptional.isPresent()) {
                response.setMensagem("Chave não encontrada no perfil do usuário.");
                response.setStatus(false);
                return response;
            }

            // Remover
            perfilDoUtilizadorRepository.delete(perfilOptional.get());

            response.setMensagem("Par chave-valor removido com sucesso.");
            response.setStatus(true);

        } catch (Exception e) {
            response.setMensagem("Erro ao remover perfil: " + e.getMessage());
            response.setStatus(false);
        }

        return response;
    }

    public ListarPerfilResponse listaPerfil(ListarPerfilRequest request) {
        ListarPerfilResponse response = new ListarPerfilResponse();

        try {
            Long userId = request.getBody().getUserId();
            Optional<Utilizador> userOpt = userRepository.findById(userId);

            if (!userOpt.isPresent()) {
                response.setStatus(false);
                response.setMensagem("Usuário não encontrado.");
                return response;
            }

            Utilizador user = userOpt.get();
            List<PerfilDoUtlizador> perfilList = perfilDoUtilizadorRepository.findByUserId(user.getId());

            // verificar se perfilList está vazio
            if(perfilList.isEmpty()) {
                response.setStatus(false);
                response.setMensagem("Nenhum perfil encontrado para o usuário.");
                return response;
            } 

            // Garantir que a lista seja inicializada
            List<ParChaveValorType> perfis = new ArrayList<>();

            for (PerfilDoUtlizador p : perfilList) {
                ParChaveValorType perfilItem = new ParChaveValorType();
                perfilItem.setChave(p.getChave());
                perfilItem.setValor(p.getValor());
                perfis.add(perfilItem);
            }

            // Atribuir a lista preenchida à resposta
            response.getPerfil().addAll(perfis);
            response.setStatus(true);
            response.setMensagem("Perfil carregado com sucesso.");

        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(false);
            response.setMensagem("Erro ao carregar perfil: " + e.getMessage());
        }

        return response;
    }

}
