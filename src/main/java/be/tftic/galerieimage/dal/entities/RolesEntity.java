package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "roles", schema = "galerieimage", catalog = "")
@Data
public class RolesEntity {

    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "nom")
    private String nom;


    /*@OneToMany(mappedBy = "rolesByRolesId")
    private Collection<RolesHasPermissionsEntity> rolesHasPermissionsById;*/

    @OneToMany(mappedBy = "rolesByRolesId")
    @JsonIgnoreProperties("rolesByRolesId")
    private Collection<UtilisateursEntity> utilisateursById;

}
