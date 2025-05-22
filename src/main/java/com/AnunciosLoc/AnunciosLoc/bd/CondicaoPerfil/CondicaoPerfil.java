package com.AnunciosLoc.AnunciosLoc.bd.condicaoPerfil;

import javax.persistence.*;

import com.AnunciosLoc.AnunciosLoc.bd.politicaEntrega.PoliticaEntrega;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Data
@Entity
@Table(name = "condicao_perfil")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CondicaoPerfil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String chave; // Ex: "profissao"

    @Column(nullable = false)
    private String valor; // Ex: "Estudante"

    @ManyToOne
    @JoinColumn(name = "politica_entrega_id")
    private PoliticaEntrega politicaEntrega;

}
