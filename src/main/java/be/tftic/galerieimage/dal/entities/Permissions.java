package be.tftic.galerieimage.dal.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "permissions")
@Data
public class Permissions {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String description;

    private String nom;

    @ManyToMany(mappedBy = "permissions")
    private Set<Roles> roles = new HashSet<>();

}
