// package com.AnunciosLoc.AnunciosLoc.config.security.JwtToken;

// import com.auth0.jwt.JWT;
// import com.auth0.jwt.algorithms.Algorithm;
// import com.auth0.jwt.exceptions.JWTCreationException;
// import com.auth0.jwt.exceptions.JWTVerificationException;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Component;

// import java.time.LocalDateTime;
// import java.time.ZoneOffset;
// import java.util.Date;

// @Component
// public class Token {

//     private final Algorithm algorithm;

//     // Carrega a chave secreta do application.properties
//     public Token(@Value("${security.jwt.secret}") String secretKey) {
//         this.algorithm = Algorithm.HMAC256(secretKey);
//     }

//     // Gera token com tempo variável de expiração
//     public String generateToken(String email, int tipo) {
//         try {
//             return JWT.create()
//                     .withIssuer("anunciosloc-server")
//                     .withSubject(email)
//                     .withExpiresAt(generateExpiration(tipo))
//                     .sign(algorithm);
//         } catch (JWTCreationException e) {
//             throw new RuntimeException("Erro ao gerar token", e);
//         }
//     }

//     // Retorna o email (subject) contido no token
//     public String extractSubject(String token) {
//         try {
//             return JWT.require(algorithm)
//                     .withIssuer("anunciosloc-server")
//                     .build()
//                     .verify(token)
//                     .getSubject();
//         } catch (JWTVerificationException e) {
//             return null;
//         }
//     }

//     // Verifica validade do token
//     public boolean isTokenValid(String token, String email) {
//         String subject = extractSubject(token);
//         return subject != null && subject.equals(email) && !isTokenExpired(token);
//     }

//     // Verifica se o token está expirado
//     public boolean isTokenExpired(String token) {
//         Date expiration = extractExpiration(token);
//         return expiration == null || expiration.before(new Date());
//     }

//     // Extrai a data de expiração
//     public Date extractExpiration(String token) {
//         try {
//             return JWT.require(algorithm)
//                     .withIssuer("anunciosloc-server")
//                     .build()
//                     .verify(token)
//                     .getExpiresAt();
//         } catch (JWTVerificationException e) {
//             return null;
//         }
//     }

//     // Expiração variável (2h se tipo = 1, senão 24h)
//     private Date generateExpiration(int tipo) {
//         int hours = (tipo == 1) ? 2 : 24;
//         return Date.from(LocalDateTime.now().plusHours(hours).toInstant(ZoneOffset.UTC));
//     }

// }
