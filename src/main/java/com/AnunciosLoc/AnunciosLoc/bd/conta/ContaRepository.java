package com.AnunciosLoc.AnunciosLoc.bd.conta;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ContaRepository extends JpaRepository<Conta, Long> {
    Optional<Conta> findByUserId(Long userId);
}
