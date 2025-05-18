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
import com.AnunciosLoc.AnunciosLoc.services.UserService;

import xml.soap.user.*;

@Endpoint
@Component
public class UserEndPoint {

    private static final String NAMESPACE_URI = "http://user.soap.xml";

    
    @Autowired
    private final UserService userService;

    public UserEndPoint(UserService userService) {
        this.userService = userService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddUserRequest")
    @ResponsePayload
    public AddUserResponse addUser(@RequestPayload AddUserRequest request) {
       return this.userService.addUser(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "LoginRequest")
    @ResponsePayload
    public UserResponse login(@RequestPayload LoginRequest request) {
       return this.login(request);
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "LogoutRequest")
    @ResponsePayload
    public LogoutResponse logout(@RequestPayload LogoutRequest request) {
        return this.logout(request);
    }
}
