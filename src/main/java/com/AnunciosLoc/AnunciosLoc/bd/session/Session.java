package com.AnunciosLoc.AnunciosLoc.bd.session;

import javax.persistence.*;

import com.AnunciosLoc.AnunciosLoc.bd.utilizador.Utilizador;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "session")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Session {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "token", unique = true, nullable = false)
    protected String token;
    @OneToOne
    @JoinColumn(name = "user", unique = true)
    protected Utilizador user;

}
