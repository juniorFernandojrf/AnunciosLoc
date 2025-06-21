package com.AnunciosLoc.AnunciosLoc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnunciosLoc.AnunciosLoc.bd.utilizador.Utilizador;
import com.AnunciosLoc.AnunciosLoc.bd.utilizador.UtilizadorRepository;
import com.AnunciosLoc.AnunciosLoc.utils.HashPassword;

import xml.soap.user.*;

@Service
public class UtilizadorService {

    @Autowired(required = true)
    private UtilizadorRepository userRepository;

    @Autowired
    ContaService contaService;
    
    public UserResponse addUser(AddUserRequest request) {
        UserResponse response = new UserResponse();
        System.out.println("Entrando no serviço de Cadastro");

        try {
            // Construir o User com os dados do request
            Utilizador user = new Utilizador();
            user.setEmail(request.getBody().getEmail());
            user.setPassword(HashPassword.hashing(request.getBody().getPassword()));
            user.setUsername(request.getBody().getUsername());
            user.setGenero(request.getBody().getGenero());
            user.setTipo(request.getBody().getTipo());
            user.setTelefone(request.getBody().getTelefone());
            user.setDatanascimento(request.getBody().getDatanascimento());

            userRepository.save(user); // Salvar na BD

            // Criar conta para o usuário
            boolean contaCriada = contaService.criarConta(user.getId(), user.getUsername());
            
            // Verificar se a conta foi criada com sucesso
            if (!contaCriada) {
                response.setMensagem("Conta já existe para este usuário.");
                response.setEstado(false);
                return response;
            }else {
                response.setMensagem("Conta criada com sucesso para o usuário: " + user.getUsername());
            }

            response.setMensagem("Usuário cadastrado com sucesso.");
            System.out.println("Usuario Cadastrado com Sucesso" + user);
            response.setEstado(true);
        } catch (Exception e) {
            response.setMensagem("Erro ao cadastrar usuário: " + e.getMessage());
            response.setEstado(false);
        }

        return response;
    }

    public LoginResponse login(LoginRequest request) {
        System.out.println("Entrando no serviço de login");

        LoginResponse response = new LoginResponse();

        // Buscar apenas pelo email
        Optional<Utilizador> userOpt = userRepository.findByEmail(request.getEmail());

        if (userOpt.isPresent()) {
            Utilizador user = userOpt.get();

            // Verificar se a senha digitada bate com o hash
            if (user.getPassword().equals(HashPassword.hashing(request.getPassword()))){
                System.out.println("Usuário autenticado com sucesso: " + user.getEmail());
                response.setId(user.getId());
                response.setEmail(user.getEmail());
                response.setUsername(user.getUsername());
                response.setDatanascimento(user.getDatanascimento());
                response.setGenero(user.getGenero());
                response.setTelefone(user.getTelefone());
                response.setStatus(true);
                response.setMensagem("Login realizado com sucesso.");
                response.setId(user.getId());
            } else {
                response.setStatus(false);
                response.setMensagem("Senha incorreta.");
                response.setId(0);
            }
        } else {
            response.setStatus(false);
            response.setMensagem("Usuário não encontrado.");
            response.setId(0);
        }

        return response;
    }

    public LogoutResponse logout(LogoutRequest request) {
        System.out.println("Entrando no serviço de logout");

        LogoutResponse response = new LogoutResponse();

        Optional<Utilizador> userOpt = userRepository.findByEmail(request.getEmail()); // 

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
