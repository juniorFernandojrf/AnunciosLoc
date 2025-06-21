package com.AnunciosLoc.AnunciosLoc.bd.politicaDeEntrega;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliticaDeEntregaRepository extends JpaRepository<PoliticaDeEntrega, Long> {
}
