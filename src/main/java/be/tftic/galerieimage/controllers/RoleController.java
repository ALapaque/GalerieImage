package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entitites.Permission;
import be.tftic.galerieimage.dal.entitites.Role;
import be.tftic.galerieimage.dal.services.RoleService;
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
public class RoleController {

    @Autowired
    private RoleService service;

    @GetMapping("")
    public ResponseEntity<List<Role>> getAll(){

        return new ResponseEntity<List<Role>>((List<Role>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Role>> getById(@PathVariable("id") int id){

        return new ResponseEntity<Optional<Role>>(service.getById(id), HttpStatus.OK);
    }
}
