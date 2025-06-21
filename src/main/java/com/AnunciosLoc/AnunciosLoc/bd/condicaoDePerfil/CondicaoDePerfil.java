package com.AnunciosLoc.AnunciosLoc.bd.condicaoDePerfil;

import javax.persistence.*;

import com.AnunciosLoc.AnunciosLoc.bd.politicaDeEntrega.PoliticaDeEntrega;

import lombok.*;

import java.io.Serializable;

@Data
@Entity
@Table(name = "condicao_de_perfil")
@NoArgsConstructor
@AllArgsConstructor
public class CondicaoDePerfil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = true)
    private String chave; // Ex: "profissao"

    @Column(nullable = true)
    private String valor; // Ex: "Estudante"

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "politica_de_entrega_id")
    private PoliticaDeEntrega politicaEntrega;

}