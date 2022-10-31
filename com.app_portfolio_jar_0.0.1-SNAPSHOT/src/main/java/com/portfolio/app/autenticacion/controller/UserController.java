package com.portfolio.app.autenticacion.controller;

import com.portfolio.app.autenticacion.model.Usuario;
import com.portfolio.app.autenticacion.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserRepository userRepo;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Usuario userdata) {
        System.out.println(userdata);
        Usuario user = userRepo.findByUserId(userdata.getUserId());
        if (user.getPassword().equals(userdata.getPassword())) {
            return new ResponseEntity(HttpStatus.OK);
        }
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }

}
