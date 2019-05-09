package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "roles")
@Data
public class Roles {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String nom;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "roles_has_permissions",
            joinColumns = @JoinColumn(name = "Roles_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "Permissions_ID", referencedColumnName = "ID"))
    private Set<Permissions> permissions;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<Utilisateurs> utilisateurs;
}
