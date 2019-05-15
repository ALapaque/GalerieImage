package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entitites.Utilisateur;
import be.tftic.galerieimage.dal.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("utilisateur")
@CrossOrigin
public class UtilisateurController {

    @Autowired
    private UtilisateurService service;

    @GetMapping("")
    public ResponseEntity<List<Utilisateur>> getAll(){

        return new ResponseEntity<List<Utilisateur>>((List<Utilisateur>) service.getAll(), HttpStatus.OK);
    }


}
