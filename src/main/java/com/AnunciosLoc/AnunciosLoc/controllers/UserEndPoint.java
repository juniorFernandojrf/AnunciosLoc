package com.AnunciosLoc.AnunciosLoc.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.AnunciosLoc.AnunciosLoc.bd.user.User;
import com.AnunciosLoc.AnunciosLoc.bd.user.UserRepository;

import xml.soap.user.*;

@Endpoint
@Component
public class UserEndPoint {

    private static final String NAMESPACE_URI = "http://user.soap.xml";

    @Autowired
    private final UserRepository userRepository;

    public UserEndPoint(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddUserRequest")
    @ResponsePayload
    public AddUserResponse addUser(@RequestPayload AddUserRequest request) {
        AddUserResponse response = new AddUserResponse();
        try {
            // Construir o User com os dados do request
            User user = new User();
            user.setEmail(request.getBody().getEmail());
            user.setPassword(request.getBody().getPassword());
            user.setUsername(request.getBody().getUsername());
            user.setNomecompleto(request.getBody().getNomecompleto());
            user.setGenero(request.getBody().getGenero());
            user.setFoto(request.getBody().getFoto());
            user.setTipo(request.getBody().getTipo());
            user.setNacionalidade(request.getBody().getNacionalidade());
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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "LoginRequest")
    @ResponsePayload
    public UserResponse login(@RequestPayload LoginRequest request) {
        System.out.println("Entrando no serviço de login");

        UserResponse response = new UserResponse();
        Optional<User> userOpt = userRepository.findByEmailAndPassword(
                request.getEmail(), request.getPassword());

        if (userOpt.isPresent()) {
            User user = userOpt.get();
            response.setEstado(true);
            response.setMensagem("Login realizado com sucesso.");
            response.setStateCode(1);
            response.setId(user.getId());
            response.setCiclistaId(user.getId()); // ou outro campo relacionado
        } else {
            response.setEstado(false);
            response.setMensagem("Credenciais inválidas.");
            response.setStateCode(0);
            response.setId(0);
            response.setCiclistaId(0);
        }
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "LogoutRequest")
    @ResponsePayload
    public LogoutResponse logout(@RequestPayload LogoutRequest request) {
        System.out.println("Entrando no serviço de logout");

        LogoutResponse response = new LogoutResponse();

        Optional<User> userOpt = Optional.ofNullable(userRepository.findByEmail(request.getEmail()));

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
