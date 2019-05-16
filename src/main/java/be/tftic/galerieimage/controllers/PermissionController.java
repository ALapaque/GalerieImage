package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entitites.Motscle;
import be.tftic.galerieimage.dal.entitites.Permission;
import be.tftic.galerieimage.dal.services.MotscleService;
import be.tftic.galerieimage.dal.services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/permission")
@CrossOrigin
public class PermissionController {

    @Autowired
    private PermissionService service;

    @GetMapping("")
    public ResponseEntity<List<Permission>> getAll(){

        return new ResponseEntity<List<Permission>>((List<Permission>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Permission>> getById(@PathVariable("id") int id){

        return new ResponseEntity<Optional<Permission>>(service.getById(id), HttpStatus.OK);
    }
}
