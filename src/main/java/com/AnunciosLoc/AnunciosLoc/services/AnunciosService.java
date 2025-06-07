package com.AnunciosLoc.AnunciosLoc.services;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.AnunciosLoc.AnunciosLoc.bd.anuncio.Anuncio;
import com.AnunciosLoc.AnunciosLoc.bd.anuncio.AnuncioRepository;
import com.AnunciosLoc.AnunciosLoc.bd.condicaoPerfil.CondicaoPerfil;
import com.AnunciosLoc.AnunciosLoc.bd.local.Local;
import com.AnunciosLoc.AnunciosLoc.bd.local.LocalRepository;
import com.AnunciosLoc.AnunciosLoc.bd.politicaEntrega.PoliticaEntrega;
import com.AnunciosLoc.AnunciosLoc.bd.politicaEntrega.PoliticaEntregaRepository;
import com.AnunciosLoc.AnunciosLoc.bd.user.User;
import com.AnunciosLoc.AnunciosLoc.bd.user.UserRepository;
import com.AnunciosLoc.AnunciosLoc.utils.anuncio.AnuncioUtil;

import xml.soap.anuncios.*;

@Service
public class AnunciosService {

    private final AnuncioRepository anuncioRepository;
    private final UserRepository userRepository;
    private final LocalRepository localizacaoRepository;
    private final PoliticaEntregaRepository politicaEntregaRepository;

    @Autowired
    private AnuncioUtil anuncioUtil;

    public AnunciosService(
            AnuncioRepository anuncioRepository,
            UserRepository userRepository,
            PoliticaEntregaRepository politicaEntregaRepository,
            LocalRepository localizacaoRepository) {
        this.anuncioRepository = anuncioRepository;
        this.userRepository = userRepository;
        this.politicaEntregaRepository = politicaEntregaRepository;
        this.localizacaoRepository = localizacaoRepository;
    }

    public AddAnuncioResponse addAnuncio(AddAnuncioRequest request) {
        AddAnuncioResponse response = new AddAnuncioResponse();

        try {
            // Validar usuário
            Optional<User> userOptional = userRepository.findById(request.getBody().getUserId());
            if (!userOptional.isPresent()) {
                response.setStatus(false);
                response.setMensagem("Usuário não encontrado.");
                return response;
            }

            // Validar local
            Optional<Local> localOptional = localizacaoRepository.findById(request.getBody().getLocalId());
            if (!localOptional.isPresent()) {
                response.setStatus(false);
                response.setMensagem("Local não encontrado.");
                return response;
            }

            User user = userOptional.get();
            Local local = localOptional.get();

            // Validar datas
            if (request.getBody().getDatainicio() == null || request.getBody().getDataExpiracao() == null) {
                response.setStatus(false);
                response.setMensagem("Data de início ou expiração não informada.");
                return response;
            }

            LocalDateTime inicio = request.getBody().getDatainicio().toGregorianCalendar()
                    .toZonedDateTime().withZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
            LocalDateTime expiracao = request.getBody().getDataExpiracao().toGregorianCalendar()
                    .toZonedDateTime().withZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();

            if (inicio.isAfter(expiracao)) {
                response.setStatus(false);
                response.setMensagem("A data de início não pode ser posterior à data de expiração.");
                return response;
            }

            // Criar anúncio
            Anuncio anuncio = new Anuncio();
            anuncio.setTitulo(request.getBody().getTitulo());
            anuncio.setDescricao(request.getBody().getDescricao());
            anuncio.setDataInicio(inicio);
            anuncio.setDataExpiracao(expiracao);
            anuncio.setUser(user);
            anuncio.setLocalizacao(local);
            anuncio = anuncioRepository.save(anuncio);

            // Validar política de entrega
            if (request.getBody().getPoliticaEntrega() == null) {
                response.setStatus(false);
                response.setMensagem("Erro: política de entrega não informada corretamente.");
                return response;
            }

            // Processar política de entrega
            List<PoliticaEntregaType> politicas = request.getBody().getPoliticaEntrega();
            PoliticaEntregaType politicaEntregaType = (politicas != null && !politicas.isEmpty()) ? politicas.get(0)
                    : null;

            PoliticaEntrega politica = new PoliticaEntrega();
            List<CondicaoPerfil> condicoes = new ArrayList<>();
            PoliticaTipo tipoPoliticaEnum = PoliticaTipo.WHITELIST; // padrão

            boolean temCondicaoValida = false;

            if (politicaEntregaType != null) {

                String titulo = politicaEntregaType.getTitulo().name();
                try {
                    tipoPoliticaEnum = PoliticaTipo.valueOf(titulo.toUpperCase());
                } catch (IllegalArgumentException e) {
                    response.setStatus(false);
                    response.setMensagem("Tipo de política inválido: " + titulo);
                    return response;
                }

                politica.setTitulo(
                        com.AnunciosLoc.AnunciosLoc.bd.politicaEntrega.PoliticaTipo.valueOf(tipoPoliticaEnum.name()));

                if (politicaEntregaType.getCondicoes() != null) {
                    for (CondicaoPerfilType cond : politicaEntregaType.getCondicoes()) {
                        List<String> chaves = cond.getChave();
                        List<String> valores = cond.getValor();

                        // Validar que chave e valor não estejam vazios ou nulos
                        if (chaves != null && !chaves.isEmpty() &&
                                valores != null && !valores.isEmpty() &&
                                !chaves.get(0).trim().isEmpty() &&
                                !valores.get(0).trim().isEmpty()) {

                            CondicaoPerfil cp = new CondicaoPerfil();
                            cp.setChave(chaves.get(0));
                            cp.setValor(valores.get(0));
                            cp.setPoliticaEntrega(politica);
                            condicoes.add(cp);
                            temCondicaoValida = true;
                        }
                    }
                }

                // Validação para impedir política BLACKLIST sem condições válidas
                if (tipoPoliticaEnum == PoliticaTipo.BLACKLIST && !temCondicaoValida) {
                    response.setStatus(false);
                    response.setMensagem("A política BLACKLIST exige ao menos uma condição válida.");
                    return response;
                }

                if (tipoPoliticaEnum == PoliticaTipo.WHITELIST && !temCondicaoValida) {
                    condicoes.clear();
                }

            } else {

                tipoPoliticaEnum = PoliticaTipo.WHITELIST;
                politica.setTitulo(com.AnunciosLoc.AnunciosLoc.bd.politicaEntrega.PoliticaTipo
                        .valueOf(PoliticaTipo.WHITELIST.name()));
                condicoes.clear(); // ← NENHUMA CONDIÇÃO
            }

            politica.setAnuncio(anuncio);

            // Verificação da política DEPOIS de extrair os dados
            if (tipoPoliticaEnum == PoliticaTipo.BLACKLIST && !temCondicaoValida) {
                response.setStatus(false);
                response.setMensagem("A política BLACKLIST exige ao menos uma condição válida.");
                return response;
            }

            politica.setCondicoes(condicoes);
            politicaEntregaRepository.save(politica);

            // Resposta - Política
            PoliticaEntregaType politicaResponse = new PoliticaEntregaType();
            politicaResponse.setTitulo(tipoPoliticaEnum);
            for (CondicaoPerfil cp : condicoes) {
                CondicaoPerfilType cpt = new CondicaoPerfilType();
                if (cp.getChave() != null)
                    cpt.getChave().add(cp.getChave());
                if (cp.getValor() != null)
                    cpt.getValor().add(cp.getValor());
                politicaResponse.getCondicoes().add(cpt);
            }
            response.setPolitiEntrega(politicaResponse);

            // Resposta - Usuário
            UserType userType = new UserType();
            userType.setId(user.getId());
            userType.setEmail(user.getEmail());
            userType.setUsername(user.getUsername());
            userType.setGenero(user.getGenero());
            userType.setProfissao(user.getProfissao());
            userType.setTelefone(user.getTelefone());
            userType.setFoto(user.getFoto());
            response.getUsuario().add(userType);

            // Resposta - Local
            LocalType localType = new LocalType();
            localType.setId(local.getId());
            localType.setNome(local.getNome());
            localType.setLatitude(local.getLatitude());
            localType.setLongitude(local.getLongitude());
            response.getLocalType().add(localType);

            // Sucesso
            response.setStatus(true);
            response.setMensagem("Anúncio adicionado com sucesso.");
            response.setAnuncioId(anuncio.getId());
            response.setUserId(user.getId());
            response.setLocalId(local.getId());

        } catch (Exception e) {
            e.printStackTrace();

            String mensagemErro;
            if (e instanceof IllegalArgumentException) {
                mensagemErro = "Houve um problema com os dados fornecidos.";
            } else if (e instanceof java.time.format.DateTimeParseException) {
                mensagemErro = "Formato de data inválido.";
            } else if (e.getCause() != null && e.getCause().toString().contains("constraint")) {
                mensagemErro = "Conflito nos dados informados.";
            } else {
                mensagemErro = "Erro inesperado. Tente novamente.";
            }

            response.setStatus(false);
            response.setMensagem(mensagemErro);
        }

        return response;
    }

    @Transactional
    public AllAnuncioResponse getAllAnuncios(AllAnuncioRequest request) {
        AllAnuncioResponse response = new AllAnuncioResponse();
        List<AnuncioType> anunciosDisponiveis = new ArrayList<>();

        try {
            // Dados do corpo da requisição
            Long userId = request.getBody().getUserId();
            Double latitude = request.getBody().getLatitude();
            Double longitude = request.getBody().getLongitude();

            // Buscar todos os anúncios
            List<Anuncio> anuncios = anuncioRepository.findAll();
            LocalDateTime agora = LocalDateTime.now();

            System.out.println("Total de anúncios encontrados: " + anuncios.size());

            for (Anuncio anuncio : anuncios) {
                System.out.println("Verificando anúncio ID: " + anuncio.getId());

                if (anuncio.getDataInicio().isAfter(agora) || anuncio.getDataExpiracao().isBefore(agora)) {
                    System.out.println("Anúncio fora do período válido: " + anuncio.getId());
                    continue;
                }

                Local local = anuncio.getLocalizacao();
                if (local == null || local.getLatitude() == null || local.getLongitude() == null) {
                    System.out.println("Local inválido para anúncio ID: " + anuncio.getId());
                    continue;
                }
                
                if (!anuncioUtil.estaProximo(latitude, longitude, local.getLatitude(), local.getLongitude())) {
                    System.out.println("Anúncio fora da distância: " + anuncio.getId());
                    continue;
                }

                // Se passou nos filtros
                AnuncioType anuncioType = anuncioUtil.MapAnuncioType(anuncio);
                anunciosDisponiveis.add(anuncioType);

                // Adicionar o local do anúncio à resposta
                if (anuncio.getLocalizacao() != null) {
                    LocalType localDoAnuncio = anuncioUtil.mapLocalToLocalType(anuncio.getLocalizacao());
                    response.getLocalType().add(localDoAnuncio); // <-- Agora retorna os locais dos anúncios!
                }

                // Se chegou aqui, adiciona à lista
                anunciosDisponiveis.add(anuncioUtil.MapAnuncioType(anuncio));
            }

            System.out.println("Total de anúncios disponíveis após filtro: " + anunciosDisponiveis.size());

            // Preencher resposta
            if (anunciosDisponiveis.isEmpty()) {
                response.setMensagem("Nenhum anúncio disponível com os filtros aplicados.");
            } else {
                response.setMensagem("Anúncios disponíveis retornados com sucesso.");
            }

            response.setEstado(true);
            response.getAnuncios().addAll(anunciosDisponiveis);
            System.out.println("Total de anúncios disponíveis: " + anunciosDisponiveis.size());

            // Adicionar informações adicionais (usuário e local)
            if (!anunciosDisponiveis.isEmpty()) {
                // Adicionar informações adicionais (usuário e local)
                User user = userRepository.findById(userId).orElse(null);
                UserType userType = anuncioUtil.mapUserToUserType(user);
                if (userType != null) {
                    response.getUsuario().add(userType);
                }

                Local local = localizacaoRepository.findById(request.getBody().getLocalId()).orElse(null);
                if (local != null) {
                    response.getLocalType().add(anuncioUtil.mapLocalToLocalType(local));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.setEstado(false);
            response.setMensagem("Erro ao buscar anúncios: " + e.getMessage());
        }

        return response;
    }

}
