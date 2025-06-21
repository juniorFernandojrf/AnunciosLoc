package com.AnunciosLoc.AnunciosLoc.bd.session;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AnunciosLoc.AnunciosLoc.bd.user.User;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    Session findByToken(String token);

    // @Query("SELECT u FROM session s WHERE s.user = :user")
    Session findByUser(User user);

}
