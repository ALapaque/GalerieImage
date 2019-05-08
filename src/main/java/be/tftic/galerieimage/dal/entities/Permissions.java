package be.tftic.galerieimage.dal.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Permissions")
@Data
public class Permissions {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Lob
    private String description;

    private String nom;

    //bi-directional many-to-many association to Role
    @ManyToMany(mappedBy="permissions")
    private List<Roles> roles;
}
