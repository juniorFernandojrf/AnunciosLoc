package com.AnunciosLoc.AnunciosLoc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.AnunciosLoc.AnunciosLoc.services.UserProfileService;

import xml.soap.user.EditUserProfileRequest;
import xml.soap.user.EditUserProfileResponse;
import xml.soap.user.UserProfileRequest;
import xml.soap.user.UserProfileResponse;

@Endpoint
@Component
public class UserProfileEndPoint {

    private static final String NAMESPACE_URI = "http://user.soap.xml";

    @Autowired
    private final UserProfileService userProfileService;

    public UserProfileEndPoint(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UserProfileRequest")
    @ResponsePayload
    public UserProfileResponse addProfile(@RequestPayload UserProfileRequest request) {
        return this.userProfileService.addProfile(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EditUserProfileRequest")
    @ResponsePayload
    public EditUserProfileResponse editProfile(@RequestPayload EditUserProfileRequest request) {
        return this.userProfileService.editProfile(request);
    }

    

}
