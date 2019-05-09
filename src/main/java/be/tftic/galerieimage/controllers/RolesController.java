package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entities.RolesEntity;
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
@RequestMapping("/role")
public class RolesController {

    @Autowired
    private RolesService service;

    @GetMapping("")
    public ResponseEntity<List<RolesEntity>> getAll(){

        return new ResponseEntity<List<RolesEntity>>((List<RolesEntity>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<RolesEntity>> getById(@PathVariable("id") int id){

        return new ResponseEntity<Optional<RolesEntity>>(service.getById(id), HttpStatus.OK);
    }
}
