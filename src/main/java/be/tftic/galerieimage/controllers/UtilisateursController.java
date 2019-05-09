package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entities.UtilisateursEntity;
import be.tftic.galerieimage.dal.services.UtilisateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateursController {

    @Autowired
    private UtilisateursService service;

    @GetMapping("")
    public ResponseEntity<List<UtilisateursEntity>> getAll(){

        return new ResponseEntity<List<UtilisateursEntity>>((List<UtilisateursEntity>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UtilisateursEntity>> getById(@PathVariable("id") int id){

        return new ResponseEntity<Optional<UtilisateursEntity>>(service.getById(id), HttpStatus.OK);
    }

}
