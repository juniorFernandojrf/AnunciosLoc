package com.AnunciosLoc.AnunciosLoc.utils.anuncio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AnunciosLoc.AnunciosLoc.bd.anuncio.Anuncio;
import com.AnunciosLoc.AnunciosLoc.bd.condicaoDePerfil.CondicaoDePerfil;
import com.AnunciosLoc.AnunciosLoc.bd.local.Local;
import com.AnunciosLoc.AnunciosLoc.bd.perfilDoUtilizador.UserProfile;
import com.AnunciosLoc.AnunciosLoc.bd.perfilDoUtilizador.UserProfileRepository;
import com.AnunciosLoc.AnunciosLoc.bd.politicaDeEntrega.PoliticaDeEntrega;
import com.AnunciosLoc.AnunciosLoc.bd.utilizador.Utilizador;
import com.AnunciosLoc.AnunciosLoc.bd.utilizador.UtilizadorRepository;

import xml.soap.anuncios.AnuncioType;
import xml.soap.anuncios.CondicaoPerfilType;
import xml.soap.anuncios.LocalType;
import xml.soap.anuncios.PoliticaEntregaType;
import xml.soap.anuncios.UserType;
import xml.soap.anuncios.PoliticaTipo; // <-- Adicione esta linha

@Component
public class AnuncioUtil {

    @Autowired
    private UtilizadorRepository userRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;

    public boolean usuarioPertenceAWhiteList(Long userId, List<CondicaoDePerfil> condicoes) {
        List<UserProfile> perfis = userProfileRepository.findByUserId(userId);

        for (CondicaoDePerfil cond : condicoes) {
            String valor = cond.getValor();

            boolean encontrado = perfis.stream()
                    .anyMatch(p -> p.getValor().equalsIgnoreCase(valor));

            if (encontrado)
                return true;
        }

        return false;
    }

    /**
     * Verifica se o usuário está BLOQUEADO por corresponder a alguma condição da
     * blacklist.
     * Retorna TRUE se o usuário deve ser bloqueado.
     */
    public boolean usuarioEstaNaBlacklist(Long userId, List<CondicaoDePerfil> condicoes) {
        Optional<Utilizador> optionalUser = userRepository.findById(userId);

        if (!optionalUser.isPresent()) {
            System.out.println("Usuário com ID " + userId + " não encontrado.");
            return false;
        }

        List<UserProfile> perfis = userProfileRepository.findByUserId(userId);

        if (perfis.isEmpty()) {
            System.out.println("Nenhum perfil encontrado para o usuário com ID: " + userId);
            return false; // Sem perfil → não bloqueia
        }

        for (CondicaoDePerfil cond : condicoes) {
            String valor = cond.getValor();

            boolean encontrado = perfis.stream()
                    .anyMatch(p -> p.getValor().equalsIgnoreCase(valor));

            if (encontrado)
                return true; // Achou uma condição → usuário bloqueado
        }

        return false; // Não achou nenhuma → pode ver
    }

    public UserType mapUserToUserType(Utilizador user) {
        if (user == null)
            return null;

        UserType userType = new UserType();
        userType.setId(user.getId());
        userType.setUsername(user.getUsername());
        userType.setEmail(user.getEmail());
        userType.setGenero(user.getGenero());
        userType.setDatanascimento(user.getDatanascimento());
        userType.setTelefone(user.getTelefone());
        
        return userType;
    }

    public AnuncioType MapAnuncioType(Anuncio anuncio) {
        if (anuncio == null)
            return null;

        AnuncioType type = new AnuncioType();
        type.setId(Math.toIntExact(anuncio.getId()));
        type.setTitulo(anuncio.getTitulo());
        type.setDataInicio(anuncio.getDataInicio().toString());
        type.setDescricao(anuncio.getDescricao());
        type.setDataExpiracao(anuncio.getDataExpiracao().toString());

        // Se quiser incluir usuário e local também:
        if (anuncio.getUser() != null) {
            UserType userType = mapUserToUserType(anuncio.getUser());
            type.setUsuario(userType);
        }

        if (anuncio.getLocalizacao() != null) {
            LocalType localType = mapLocalToLocalType(anuncio.getLocalizacao());
            type.setLocal(localType);
        }

        return type;
    }

    public LocalType mapLocalToLocalType(Local local) {
        LocalType localType = new LocalType();
        localType.setId(local.getId());
        localType.setNome(local.getNome());
        localType.setLatitude(local.getLatitude());
        localType.setLongitude(local.getLongitude());
        return localType;
    }

    public PoliticaEntregaType mapPoliticaToType(PoliticaDeEntrega politica) {
    if (politica == null) return null;

    PoliticaEntregaType type = new PoliticaEntregaType();
    type.setTitulo(PoliticaTipo.valueOf(politica.getTitulo().name()));

    if (politica.getCondicoes() != null) {
        for (CondicaoDePerfil condicao : politica.getCondicoes()) {
            CondicaoPerfilType condType = new CondicaoPerfilType();
            condType.getChave().add(condicao.getChave());
            condType.getValor().add(condicao.getValor());
            type.getCondicoes().add(condType);
        }
    }

    return type;
}

}
