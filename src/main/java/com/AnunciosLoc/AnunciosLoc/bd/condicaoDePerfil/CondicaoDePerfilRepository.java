package com.AnunciosLoc.AnunciosLoc.bd.condicaoDePerfil;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicaoDePerfilRepository extends JpaRepository<CondicaoDePerfil, Long> {
}
