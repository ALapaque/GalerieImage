package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
public class Roles {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String nom;

    //bi-directional many-to-many association to Permission
    @ManyToMany
    @JoinTable(
            name="roles_has_permissions"
            , joinColumns={
            @JoinColumn(name="Roles_ID")
    }
            , inverseJoinColumns={
            @JoinColumn(name="Permissions_ID")
    }
    )
    @JsonBackReference
    private List<Permissions> permissions;

    //bi-directional many-to-one association to Utilisateur
    @OneToMany(mappedBy="role")
    @JsonBackReference
    private List<Utilisateurs> utilisateurs;
}
