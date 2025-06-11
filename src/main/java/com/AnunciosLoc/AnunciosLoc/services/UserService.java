package com.AnunciosLoc.AnunciosLoc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.AnunciosLoc.AnunciosLoc.bd.user.User;
import com.AnunciosLoc.AnunciosLoc.bd.user.UserRepository;
// import com.AnunciosLoc.AnunciosLoc.bd.user_profile.UserRepository;
import com.AnunciosLoc.AnunciosLoc.utils.HashPassword;

import xml.soap.user.*;

@Service
public class UserService {

    @Autowired(required = true)
    private UserRepository userRepository;
    
    public AddUserResponse addUser(AddUserRequest request) {
        AddUserResponse response = new AddUserResponse();

        try {
            // Construir o User com os dados do request
            User user = new User();
            user.setEmail(request.getBody().getEmail());
            user.setPassword(HashPassword.hashing(request.getBody().getPassword()));
            user.setUsername(request.getBody().getUsername());
            user.setGenero(request.getBody().getGenero());
            user.setFoto(request.getBody().getFoto());
            user.setTipo(request.getBody().getTipo());
            user.setProfissao(request.getBody().getProfissao());
            user.setTelefone(request.getBody().getTelefone());

            userRepository.save(user); // Salvar na BD
            response.setMensagem("Usuário cadastrado com sucesso.");
            response.setStatus(true);
        } catch (Exception e) {
            response.setMensagem("Erro ao cadastrar usuário: " + e.getMessage());
            response.setStatus(false);
        }

        return response;
    }

    public UserResponse login(LoginRequest request) {
        System.out.println("Entrando no serviço de login");

        UserResponse response = new UserResponse();

        // Buscar apenas pelo email
        Optional<User> userOpt = userRepository.findByEmail(request.getEmail());

        if (userOpt.isPresent()) {
            User user = userOpt.get();

            // Verificar se a senha digitada bate com o hash
            if (user.getPassword().equals(HashPassword.hashing(request.getPassword()))){
                response.setEstado(true);
                response.setMensagem("Login realizado com sucesso.");
                response.setStateCode(1);
                response.setId(user.getId());
            } else {
                response.setEstado(false);
                response.setMensagem("Senha incorreta.");
                response.setStateCode(0);
                response.setId(0);
            }
        } else {
            response.setEstado(false);
            response.setMensagem("Usuário não encontrado.");
            response.setStateCode(0);
            response.setId(0);
        }

        return response;
    }

    public LogoutResponse logout(LogoutRequest request) {
        System.out.println("Entrando no serviço de logout");

        LogoutResponse response = new LogoutResponse();

        Optional<User> userOpt = userRepository.findByEmail(request.getEmail()); // ✅

        if (userOpt.isPresent()) {
            // Aqui você pode adicionar lógica para encerrar sessão, remover token, etc.
            response.setEstado(true);
            response.setMensagem("Logout realizado com sucesso.");
        } else {
            response.setEstado(false);
            response.setMensagem("Usuário não encontrado.");
        }

        return response;
    }

}
