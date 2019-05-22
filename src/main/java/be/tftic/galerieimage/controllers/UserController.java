package be.tftic.galerieimage.controllers;


import be.tftic.galerieimage.dal.entitites.User;
import be.tftic.galerieimage.dal.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("utilisateur")
public class UserController {

    @Autowired
    private CustomUserDetailsService service;

    @GetMapping("")
    public ResponseEntity<List<User>> getAll(){

        return new ResponseEntity<List<User>>((List<User>) service.getAll(), HttpStatus.OK);
    }


}
