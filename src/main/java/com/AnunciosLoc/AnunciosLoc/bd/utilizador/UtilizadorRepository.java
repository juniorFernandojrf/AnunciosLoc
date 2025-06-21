package com.AnunciosLoc.AnunciosLoc.bd.utilizador;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilizadorRepository extends JpaRepository<Utilizador, Long> {

    Utilizador findByUsername(String username);
    Optional<Utilizador> findByEmail(String email);
    Optional<Utilizador> findById(String email);

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

    Optional<Utilizador> findByEmailAndPassword(String email, String password);
}
