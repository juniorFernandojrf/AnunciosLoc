package com.AnunciosLoc.AnunciosLoc.utils;

import org.springframework.stereotype.Component;

import xml.soap.user.AllUserProfileResponse;
import xml.soap.user.ParChaveValorType;
import com.AnunciosLoc.AnunciosLoc.bd.userProfile.ParChaveValorDTO;

import java.util.List;
import java.util.ArrayList;

@Component
public class PerfilUtil {

    public xml.soap.user.AllUserProfileResponse convertToSoapResponse(List<ParChaveValorDTO> perfilDTOs) {
        xml.soap.user.AllUserProfileResponse response = new xml.soap.user.AllUserProfileResponse();
        

        response.setStatus(true);
        response.setMensagem("Perfil carregado com sucesso.");

        if (perfilDTOs != null && !perfilDTOs.isEmpty()) {
            for (ParChaveValorDTO dto : perfilDTOs) {
                ParChaveValorType type = new ParChaveValorType();
                type.setChave(dto.getChave());
                type.setValor(dto.getValor());
                response.getPerfil().add(type);
            }
        }

        return response;
    }
}