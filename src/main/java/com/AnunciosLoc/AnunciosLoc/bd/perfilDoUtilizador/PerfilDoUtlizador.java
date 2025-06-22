package com.AnunciosLoc.AnunciosLoc.bd.perfilDoUtilizador;

import javax.persistence.*;

import com.AnunciosLoc.AnunciosLoc.bd.utilizador.Utilizador;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name = "perfil_do_utilizador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PerfilDoUtlizador implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String chave;

    @Column(nullable = false)
    private String valor;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilizador user;
}
