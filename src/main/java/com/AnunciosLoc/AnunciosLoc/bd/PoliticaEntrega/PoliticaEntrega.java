package com.AnunciosLoc.AnunciosLoc.bd.politicaEntrega;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.AnunciosLoc.AnunciosLoc.bd.anuncio.Anuncio;
import com.AnunciosLoc.AnunciosLoc.bd.condicaoPerfil.CondicaoPerfil;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "politica")
@NoArgsConstructor
public class PoliticaEntrega implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PoliticaTipo  titulo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CondicaoPerfil> condicoes;

    @OneToOne
    @JoinColumn(name = "anuncio_id")
    private Anuncio anuncio;
    
}

