package com.AnunciosLoc.AnunciosLoc.bd.perfilDoUtilizador;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AnunciosLoc.AnunciosLoc.bd.utilizador.Utilizador;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    Optional<UserProfile> findByUserAndChave(Utilizador user, String chave);
    List    <UserProfile> findByUserId(Long usuer_id);
    List    <UserProfile> findByUser(Utilizador user);

}
