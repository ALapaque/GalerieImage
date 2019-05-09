package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "utilisateurs", schema = "galerieimage", catalog = "")
@Data
public class UtilisateursEntity {

    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "nom")
    private String nom;

    @Basic
    @Column(name = "prenom")
    private String prenom;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "username")
    private String username;

    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "delete")
    private byte delete;

    @Basic
    @Column(name = "Roles_ID")
    private int rolesId;

    /*@OneToMany(mappedBy = "utilisateursByUtilisateursId", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<ImagesEntity> imagesById;*/

    @ManyToOne
    @JoinColumn(name = "Roles_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private RolesEntity rolesByRolesId;

}
