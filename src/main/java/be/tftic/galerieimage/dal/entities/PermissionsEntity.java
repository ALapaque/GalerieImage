package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "permissions", schema = "galerieimage", catalog = "")
public class PermissionsEntity {

    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "nom")
    private String nom;

    @Basic
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "permissionsByPermissionsId")
    @JsonIgnoreProperties("permissionsByPermissionsId")
    private Collection<RolesHasPermissionsEntity> rolesHasPermissionsById;

}
