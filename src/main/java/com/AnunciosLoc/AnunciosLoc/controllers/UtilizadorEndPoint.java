package com.AnunciosLoc.AnunciosLoc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.AnunciosLoc.AnunciosLoc.services.PerfilDoUtilizadorService;
import com.AnunciosLoc.AnunciosLoc.services.UtilizadorService;

import xml.soap.user.*;

@Endpoint
@Component
public class UtilizadorEndPoint {

    private static final String NAMESPACE_URI = "http://user.soap.xml";

    @Autowired
    private final UtilizadorService userService;


    public UtilizadorEndPoint(UtilizadorService userService, PerfilDoUtilizadorService userProfileService) {
        this.userService = userService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddUserRequest")
    @ResponsePayload
    public UserResponse addUser(@RequestPayload AddUserRequest request) {
        return this.userService.addUser(request);
    }
    

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "LoginRequest")
    @ResponsePayload
    public LoginResponse login(@RequestPayload LoginRequest request) {
        return this.userService.login(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "LogoutRequest")
    @ResponsePayload
    public LogoutResponse logout(@RequestPayload LogoutRequest request) {
        return this.userService.logout(request);
    }

}
