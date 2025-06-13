package com.AnunciosLoc.AnunciosLoc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.AnunciosLoc.AnunciosLoc.bd.interesses.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xml.soap.interesses.*;

@Service

public class InteressesService {
    @Autowired
    private final InteressesRepository interessesRepository;

    public InteressesService(InteressesRepository interessesRepository) {
        this.interessesRepository = interessesRepository;
    }
    


    // Listar Interesses
    public AllInteressesResponse listarTodosOsInteresses(AllInteressesRequest request) {
    AllInteressesResponse response = new AllInteressesResponse();
    try {
        List<Interesses> interesses = interessesRepository.findAll();
        System.out.println(interesses);
        for (Interesses interesse : interesses) {
            InteressesType interessesType = new InteressesType();
            interessesType.setId(0);
            interessesType.setName(null);
            response.getInteresses().add(interessesType);
        }
        response.setStatus(true);
        response.setMensagem("Interesses listados com sucesso.");
    } catch (Exception e) {
        response.setStatus(false);
        response.setMensagem("Erro ao listar interesses: " + e.getMessage());
    }

    return response;
}

}
