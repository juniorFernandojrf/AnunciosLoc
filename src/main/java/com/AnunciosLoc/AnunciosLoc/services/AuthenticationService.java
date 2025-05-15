package com.AnunciosLoc.AnunciosLoc.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnunciosLoc.AnunciosLoc.bd.session.Session;
import com.AnunciosLoc.AnunciosLoc.bd.session.SessionRepository;
import com.AnunciosLoc.AnunciosLoc.bd.user.User;
import com.AnunciosLoc.AnunciosLoc.bd.user.UserRepository;
import com.AnunciosLoc.AnunciosLoc.config.security.JwtToken.Token;
import com.AnunciosLoc.AnunciosLoc.utils.HashPassword;
//import ao.uan.fc.cc4.bikeshared.wsAsCliente.ofReplica.WSReplica;
import xml.soap.user.LoginRequest;
import xml.soap.user.LogoutRequest;
import xml.soap.user.UserResponse;
import xml.soap.user.ValidateTokenRequest;

@Service
public class AuthenticationService {

    @Autowired(required = true)
    private UserRepository userRepo;
    @Autowired(required = true)
    private SessionRepository sessionRepo;
    //@Autowired(required = true)
    //private WSReplica serverWriter;
    @Autowired
    private Token jwtToken;

}