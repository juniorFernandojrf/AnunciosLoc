package com.AnunciosLoc.AnunciosLoc.bd.coordenadas;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name = "coordenadas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Coordenadas implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "latitude", unique = true, nullable = false)
    protected Double latitude;
    @Column(name = "longitude", nullable = false)
    protected Double longitude;
    @Column(name = "ssid", nullable = false)
    protected String ssid;

}
