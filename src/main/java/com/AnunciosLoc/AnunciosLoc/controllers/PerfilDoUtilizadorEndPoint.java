package com.AnunciosLoc.AnunciosLoc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.AnunciosLoc.AnunciosLoc.services.PerfilDoUtilizadorService;
import xml.soap.user.ListarPerfilRequest;
import xml.soap.user.ListarPerfilResponse;
import xml.soap.user.UserProfileRequest;
import xml.soap.user.UserProfileResponse;
import xml.soap.user.EditUserProfileRequest;
import xml.soap.user.EditUserProfileResponse;
import xml.soap.user.RemoveUserProfileRequest;
import xml.soap.user.RemoveUserProfileResponse;

@Endpoint
@Component
public class PerfilDoUtilizadorEndPoint {

    private static final String NAMESPACE_URI = "http://user.soap.xml"; // Confira no WSDL

    private final PerfilDoUtilizadorService userProfileService;

    @Autowired
    public PerfilDoUtilizadorEndPoint(PerfilDoUtilizadorService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UserProfileRequest")
    @ResponsePayload
    public UserProfileResponse addProfileUser(@RequestPayload UserProfileRequest request) {
        System.out.println("Interesses recebidos: " + request.getValor().size());

        userProfileService.addProfile(request.getUserId(), request.getValor());
        UserProfileResponse response = new UserProfileResponse();
        response.setMensagem("Interesses salvos com sucesso!");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EditUserProfileRequest")
    @ResponsePayload
    public EditUserProfileResponse editProfile(@RequestPayload EditUserProfileRequest request) {
        return this.userProfileService.editProfile(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "RemoveUserProfileRequest")
    @ResponsePayload
    public RemoveUserProfileResponse removeProfile(@RequestPayload RemoveUserProfileRequest request) {
        return this.userProfileService.removeProfile(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ListarPerfilRequest")
    @ResponsePayload
    public ListarPerfilResponse listaPerfil(@RequestPayload ListarPerfilRequest request) {
        return this.userProfileService.listaPerfil(request); 
    }

}