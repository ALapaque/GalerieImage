package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entitites.Utilisateur;
import be.tftic.galerieimage.dal.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("utilisateur")
@CrossOrigin
public class UtilisateurController {

    @Autowired
    private UtilisateurService service;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("")
    public ResponseEntity<List<Utilisateur>> getAll(){
        return new ResponseEntity<List<Utilisateur>>((List<Utilisateur>) service.getAll(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<Utilisateur> create(@RequestBody Utilisateur u){

        u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
        return new ResponseEntity<Utilisateur>(service.create(u), HttpStatus.CREATED);
    }


}
