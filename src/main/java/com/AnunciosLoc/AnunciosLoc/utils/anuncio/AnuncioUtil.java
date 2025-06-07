package com.AnunciosLoc.AnunciosLoc.utils.anuncio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AnunciosLoc.AnunciosLoc.bd.anuncio.Anuncio;
import com.AnunciosLoc.AnunciosLoc.bd.condicaoPerfil.CondicaoPerfil;
import com.AnunciosLoc.AnunciosLoc.bd.local.Local;
import com.AnunciosLoc.AnunciosLoc.bd.user.User;
import com.AnunciosLoc.AnunciosLoc.bd.user.UserRepository;
import com.AnunciosLoc.AnunciosLoc.bd.userProfile.UserProfile;
import com.AnunciosLoc.AnunciosLoc.bd.userProfile.UserProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import com.AnunciosLoc.AnunciosLoc.bd.user.UserRepository;

import xml.soap.anuncios.AnuncioType;
import xml.soap.anuncios.LocalType;
import xml.soap.anuncios.UserType;

@Component
public class AnuncioUtil {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;

    public boolean estaProximo(Double lat1, Double lon1, Double lat2, Double lon2) {
        final int R = 6371; // Raio da Terra em km
        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                        * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c;

        return distance <= 50; // Dentro de 50km
    }


    public boolean usuarioSatisfazAlgumaCondicao(Long userId, List<CondicaoPerfil> condicoes) {
        List<UserProfile> perfis = userProfileRepository.findByUserId(userId);

        for (CondicaoPerfil cond : condicoes) {
            String chave = cond.getChave();
            String valor = cond.getValor();

            boolean encontrado = perfis.stream()
                    .anyMatch(p -> p.getChave().equalsIgnoreCase(chave) &&
                            p.getValor().equalsIgnoreCase(valor));

            if (encontrado)
                return true;
        }

        return false;
    }

    public boolean usuarioSatisfazQualquerCondicao(Long userId, List<CondicaoPerfil> condicoes) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent())
            return false;

        User user = optionalUser.get();
        List<UserProfile> perfis = userProfileRepository.findByUserId(userId);

        for (CondicaoPerfil cond : condicoes) {
            String chave = cond.getChave();
            String valor = cond.getValor();

            boolean encontrado = perfis.stream()
                    .anyMatch(p -> p.getChave().equalsIgnoreCase(chave) &&
                            p.getValor().equalsIgnoreCase(valor));

            if (encontrado)
                return true;
        }

        return false;
    }

    public UserType mapUserToUserType(User user) {
        if (user == null)
            return null;

        UserType userType = new UserType();
        userType.setId(user.getId());
        userType.setUsername(user.getUsername());
        return userType;
    }
    
    public AnuncioType MapAnuncioType(Anuncio anuncio) {
        if (anuncio == null)return null;

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

}
