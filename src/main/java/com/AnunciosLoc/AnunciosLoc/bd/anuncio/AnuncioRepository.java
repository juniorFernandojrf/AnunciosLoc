package com.AnunciosLoc.AnunciosLoc.bd.anuncio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnuncioRepository extends  JpaRepository<Anuncio, Long>{

}
