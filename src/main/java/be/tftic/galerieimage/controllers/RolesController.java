package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entities.Roles;
import be.tftic.galerieimage.dal.services.RolesService;
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
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private RolesService service;

    @GetMapping("")
    public ResponseEntity<List<Roles>> getAll(){

        return new ResponseEntity<List<Roles>>((List<Roles>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Roles>> getById(@PathVariable("id") int id){

        return new ResponseEntity<Optional<Roles>>(service.getById(id), HttpStatus.OK);
    }
}
