package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "permissions")
@Data
public class Permissions {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Lob
    private String description;

    private String nom;

    //bi-directional many-to-many association to Role
    @ManyToMany(mappedBy="permissions", fetch = FetchType.LAZY)
    private List<Roles> roles;
}
