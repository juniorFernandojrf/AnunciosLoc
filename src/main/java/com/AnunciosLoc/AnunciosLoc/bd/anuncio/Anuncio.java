package com.AnunciosLoc.AnunciosLoc.bd.anuncio;

import javax.persistence.*;
import javax.xml.datatype.XMLGregorianCalendar;

import com.AnunciosLoc.AnunciosLoc.bd.local.Local;
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
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "titulo", nullable = false)
    protected String titulo;
    @Column(name = "descricao", nullable = false)
    protected String descricao;
    @Column(name = "dataexpiracao", nullable = false)
    protected String dataexpiracao;
    @Column(name = "bloquear", nullable = false)
    protected String bloquear;
    // @ManyToOne
    // @JoinColumn(name = "autor", nullable = false)
    // protected User autor;
    // @ManyToOne
    // @JoinColumn(name = "local", nullable = true)
    // protected Local local;

}
