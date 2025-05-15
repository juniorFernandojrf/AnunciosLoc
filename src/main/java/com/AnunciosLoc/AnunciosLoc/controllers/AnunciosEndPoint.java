package com.AnunciosLoc.AnunciosLoc.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.AnunciosLoc.AnunciosLoc.bd.anuncio.AnuncioRepository;
import com.AnunciosLoc.AnunciosLoc.bd.user.User;
import com.AnunciosLoc.AnunciosLoc.bd.user.UserRepository;
import com.AnunciosLoc.AnunciosLoc.utils.GeoLocationDTO;
import com.AnunciosLoc.AnunciosLoc.bd.anuncio.Anuncio;
import com.AnunciosLoc.AnunciosLoc.bd.anuncio.AnuncioRepository;
import xml.soap.anuncios.*;
import xml.soap.station.AllStationRequest;
import xml.soap.station.AllStationResponse;
import xml.soap.station.StationResponseType;
import xml.soap.user.AddUserRequest;
import xml.soap.user.AddUserResponse;

@Endpoint
@Component
public class AnunciosEndPoint {
    private static final String NAMESPACE_URI = "http://anuncios.soap.xml";

    @Autowired
    private final AnuncioRepository anuncioRepository;

    
    public AnunciosEndPoint(AnuncioRepository anuncioRepository) {
        this.anuncioRepository = anuncioRepository;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddAnuncioRequest")
    @ResponsePayload
    public AddAnuncioResponse addAnuncio(@RequestPayload AddAnuncioRequest request) {
        AddAnuncioResponse response = new AddAnuncioResponse();
        try {
            // Construir o Anuncio com os dados do request
            Anuncio anuncio = new Anuncio();
            anuncio.setTitulo(request.getBody().getTitulo());
            // anuncio.getLocal();
            anuncio.setBloquear(request.getBody().getBloquear());
            anuncio.setDescricao(request.getBody().getDescricao());
            anuncio.setDataexpiracao(request.getBody().getDataexpiracao());

            anuncioRepository.save(anuncio);
            response.setMensagem("Anuncio Publicado com sucesso.");
            response.setStatus(true);
        } catch (Exception e) {
            response.setMensagem("Erro ao publiacar o anuncio: " + e.getMessage());;
            response.setStatus(false);
        }

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AllAnuncioRequest")
    @ResponsePayload
    public AllAnuncioResponse getAllAnuncios(@RequestPayload AllAnuncioRequest request) {
        AllAnuncioResponse response = new AllAnuncioResponse();

        try {
            List<Anuncio> anuncios = anuncioRepository.findAll();

            if (anuncios.isEmpty()) {
                response.setMensagem("Nenhum anúncio encontrado.");
                response.setEstado(false);
                return response;
            }

            response.setMensagem("Anúncios listados com sucesso.");
            response.setEstado(true);

            for (Anuncio anuncio : anuncios) {
                AnuncioType item = new AnuncioType();
                item.setTitulo(anuncio.getTitulo());
                item.setDescricao(anuncio.getDescricao());
                item.setDataexpiracao(anuncio.getDataexpiracao());
                item.setBloquear(anuncio.equals(anuncio.getBloquear()));
                item.setId(anuncio.getId().intValue());

                response.getAnuncios().add(item); // ← Adiciona o item na lista de resposta
            }

        } catch (Exception e) {
            response.setMensagem("Erro ao listar os anúncios: " + e.getMessage());
            response.setEstado(false);
        }

        return response;
    }
    @PayloadRoot(namespace = "http://anuncios.soap.xml", localPart = "RemoveAnuncioRequest")
    @ResponsePayload
    public RemoveAnuncioResponse removerAnuncio(@RequestPayload RemoveAnuncioRequest request) {
        RemoveAnuncioResponse response = new RemoveAnuncioResponse();

        // Verificação do Body
        if (request == null || request.getBody() == null ) {
            response.setMensagem("Requisição inválida: body ou ID está nulo.");
            response.setStatus(false);
            response.setId(0); // Opcional
            return response;
        }

        Long id = request.getBody().getId();

        try {
            Optional<Anuncio> anuncioOpt = anuncioRepository.findById(id);

            if (anuncioOpt.isPresent()) {
                anuncioRepository.deleteById(id);
                response.setMensagem("Anúncio removido com sucesso.");
                response.setStatus(true);
                response.setId(id.intValue());
            } else {
                response.setMensagem("Anúncio com ID " + id + " não encontrado.");
                response.setStatus(false);
                response.setId(id.intValue());
            }

        } catch (Exception e) {
            response.setMensagem("Erro ao remover anúncio: " + e.getMessage());
            response.setStatus(false);
            response.setId(0); // Opcional
            e.printStackTrace();
        }

        return response;
    }
    
}
