package com.AnunciosLoc.AnunciosLoc.bd.local;

import javax.persistence.*;

import com.AnunciosLoc.AnunciosLoc.bd.anuncio.Anuncio;
import com.AnunciosLoc.AnunciosLoc.bd.coordenadas.Coordenadas;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "local")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Local implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome", unique = true, nullable = false)
    protected String nome;
    @OneToOne
    @JoinColumn(name = "coordenadas", nullable = false)
    protected Coordenadas coordenadas;

    // @OneToMany(mappedBy = "local")
    // private List<Anuncio> anuncios;

}
