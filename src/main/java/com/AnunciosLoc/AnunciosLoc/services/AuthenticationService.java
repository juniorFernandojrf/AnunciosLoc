// package com.AnunciosLoc.AnunciosLoc.services;

// import java.util.Optional;

// import org.springframework.beans.BeanUtils;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.AnunciosLoc.AnunciosLoc.bd.session.Session;
// import com.AnunciosLoc.AnunciosLoc.bd.session.SessionRepository;
// import com.AnunciosLoc.AnunciosLoc.bd.user.User;
// import com.AnunciosLoc.AnunciosLoc.bd.user.UserRepository;
// import com.AnunciosLoc.AnunciosLoc.config.security.JwtToken.Token;
// import com.AnunciosLoc.AnunciosLoc.utils.HashPassword;
// //import ao.uan.fc.cc4.bikeshared.wsAsCliente.ofReplica.WSReplica;
// import xml.soap.user.LoginRequest;
// import xml.soap.user.LogoutRequest;
// import xml.soap.user.UserResponse;
// import xml.soap.user.ValidateTokenRequest;

// @Service
// public class AuthenticationService {

//     @Autowired(required = true)
//     private UserRepository userRepo;
//     @Autowired(required = true)
//     private SessionRepository sessionRepo;
//     //@Autowired(required = true)
//     //private WSReplica serverWriter;
//     @Autowired
//     private Token jwtToken;

//       public UserResponse validationSession(ValidateTokenRequest request) {

//         System.out.println("Dentro do Serviço Validate Session");
//         UserResponse response = new UserResponse();

//         Session session = sessionRepo.findByToken(request.getAuthToken());
//         if (session == null) response.setEstado(false);
//         else {
//             response.setEstado(true);
//             Optional<User> user = userRepository.findById(session.getUser());
//             if (user.isPresent()) {
//                 // BeanUtils.copyProperties(user, response);
//                 response.setEmail(user.get().getEmail());
//                 response.setUsername(user.get().getUsername());
//                 response.setFoto(user.get().getFoto());
//                 response.setToken(session.getToken());
                
//             }
//         }
//         return response;
//     }

//     public boolean sessionIsValid (String authToken) {
//         Session session = sessionRepo.findByToken(authToken);
//         if (session!=null) {
//             Optional<User> user = userRepo.findById(session.getUser());
//             if (user.isPresent()) {
//                 if (user.get().getTipo() == 2){
//                     System.out.println("tipo 2");
//                     return true;
//                 } else {
//                     System.out.println("tipo 1");
//                     Integer confirm = (jwtToken.getSubject(session.getToken()).equals(" "))? 0 : 1;
//                     switch (confirm) {
//                         case 0: 
//                             sessionRepo.delete(session);
//                             return false;
//                         case 1:
//                             return true;
//                     }
//                 }
//             } else sessionRepo.delete(session);
//         }
//         return false;
//     }

// }