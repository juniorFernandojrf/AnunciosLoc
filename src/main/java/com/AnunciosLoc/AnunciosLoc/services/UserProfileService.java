package com.AnunciosLoc.AnunciosLoc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnunciosLoc.AnunciosLoc.bd.user.User;
import com.AnunciosLoc.AnunciosLoc.bd.user.UserRepository;
import com.AnunciosLoc.AnunciosLoc.bd.userProfile.UserProfile;
import com.AnunciosLoc.AnunciosLoc.bd.userProfile.UserProfileRepository;

import xml.soap.user.EditUserProfileRequest;
import xml.soap.user.EditUserProfileResponse;
import xml.soap.user.UserProfileRequest;
import xml.soap.user.UserProfileResponse;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private UserRepository userRepository;

    public UserProfileResponse addProfile(UserProfileRequest request) {
        UserProfileResponse response = new UserProfileResponse();

        try {
            Optional<User> userOptional = userRepository.findById(request.getBody().getUserId());

            System.out.println("Verificando User da request ID: " + request.getBody().getUserId());

            if (!userOptional.isPresent()) {
                response.setMensagem("Usuário não encontrado.");
                response.setStatus(false);
                return response;
            }

            User user = userOptional.get();

            System.out.println("Verificando User da BD ID: " + user.getId());
            if (userProfileRepository.findByUserAndChave(user, request.getBody().getChave()).isPresent()) {
                response.setMensagem("Esta chave já existe no perfil do usuário.");
                response.setStatus(false);
                return response;
            }

            UserProfile perfil = new UserProfile();
            perfil.setUser(user);
            perfil.setChave(request.getBody().getChave());
            perfil.setValor(request.getBody().getValor());

            userProfileRepository.save(perfil);

            response.setMensagem("Par chave-valor adicionado com sucesso.");
            response.setStatus(true);
        } catch (Exception e) {
            response.setMensagem("Erro ao adicionar perfil: " + e.getMessage());
            response.setStatus(false);
        }

        return response;
    }

    
    public EditUserProfileResponse editProfile(EditUserProfileRequest request) {
    EditUserProfileResponse response = new EditUserProfileResponse();

    try {
        // Busca o usuário
        Optional<User> userOptional = userRepository.findById(request.getBody().getUserId());
        if (!userOptional.isPresent()) {
            response.setMensagem("Usuário não encontrado.");
            response.setStatus(false);
            return response;
        }
        User user = userOptional.get();

        // Busca o par chave-valor antigo do utilizador
        Optional<UserProfile> perfilOptional = userProfileRepository.findByUserAndChave(user, request.getBody().getChaveAntiga());

        if (!perfilOptional.isPresent()) {
            response.setMensagem("Par chave-valor não encontrado.");
            response.setStatus(false);
            return response;
        }

        UserProfile perfil = perfilOptional.get();

        // Verifica o que deve ser atualizado
        String chaveNova = request.getBody().getNovaChaver() != null ? request.getBody().getNovaChaver() : request.getBody().getChaveAntiga();
        String valorNovo = request.getBody().getNovoValor() != null ? request.getBody().getNovoValor() : perfil.getValor();

        // Valida duplicação de chave (se a chave foi alterada)
        if (!chaveNova.equals(request.getBody().getChaveAntiga())) {
            boolean chaveJaExiste = userProfileRepository.findByUserAndChave(user, chaveNova).isPresent();
            if (chaveJaExiste) {
                response.setMensagem("A nova chave já existe no perfil do utilizador.");
                response.setStatus(false);
                return response;
            }
        }

        // Atualiza o perfil
        perfil.setChave(chaveNova);
        perfil.setValor(valorNovo);
        userProfileRepository.save(perfil);

        response.setMensagem("Perfil atualizado com sucesso.");
        response.setStatus(true);

    } catch (Exception e) {
        response.setMensagem("Erro ao atualizar perfil: " + e.getMessage());
        response.setStatus(false);
    }

    return response;
}

}
