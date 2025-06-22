package com.AnunciosLoc.AnunciosLoc.bd.perfilDoUtilizador;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AnunciosLoc.AnunciosLoc.bd.utilizador.Utilizador;

@Repository
public interface PerfilDoUtlizadorRepository extends JpaRepository<PerfilDoUtlizador, Long> {
    Optional<PerfilDoUtlizador> findByUserAndChave(Utilizador user, String chave);
    List    <PerfilDoUtlizador> findByUserId(Long usuer_id);
    List    <PerfilDoUtlizador> findByUser(Utilizador user);

}
