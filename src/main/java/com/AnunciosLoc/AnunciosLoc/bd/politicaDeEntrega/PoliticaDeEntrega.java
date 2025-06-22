package com.AnunciosLoc.AnunciosLoc.bd.politicaDeEntrega;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.AnunciosLoc.AnunciosLoc.bd.anuncio.Anuncio;
import com.AnunciosLoc.AnunciosLoc.bd.condicaoDePerfil.CondicaoDePerfil;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "politica")
@NoArgsConstructor
public class PoliticaDeEntrega implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoDePoliticaEntrega titulo; // WHITELIST ou BLACKLIST

    @OneToMany(mappedBy = "politicaEntrega", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<CondicaoDePerfil> condicoes;

    @ToString.Exclude
    @OneToOne
    @JoinColumn(name = "anuncio_id", referencedColumnName = "id")
    private Anuncio anuncio;
}
