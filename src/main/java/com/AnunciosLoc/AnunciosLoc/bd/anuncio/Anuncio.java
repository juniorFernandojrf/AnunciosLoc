package com.AnunciosLoc.AnunciosLoc.bd.anuncio;

import javax.persistence.*;

import com.AnunciosLoc.AnunciosLoc.bd.local.Local;
import com.AnunciosLoc.AnunciosLoc.bd.politicaEntrega.PoliticaEntrega;
import com.AnunciosLoc.AnunciosLoc.bd.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name = "anuncio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Anuncio implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descricao;

    @Column(name = "datainico", nullable = false)
    private String datainicio;

    @Column(name = "dataexpiracao", nullable = false)
    private String dataexpiracao;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local localizacao;

    @OneToOne(mappedBy = "anuncio", cascade = CascadeType.ALL)
    private PoliticaEntrega politicaEntrega;
    
}
