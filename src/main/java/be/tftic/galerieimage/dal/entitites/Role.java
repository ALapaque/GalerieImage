package be.tftic.galerieimage.dal.entitites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jdk.jshell.execution.Util;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="role")
@NamedQuery(name="role.findAll", query="SELECT c FROM Role c")
@Data
public class Role implements Serializable, GrantedAuthority {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, name = "id_role")
    private int id_role;

    @Column(nullable=false, length=250)
    private String nom;

    @OneToMany(mappedBy = "role", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnoreProperties("utilisateur")
    private List<Utilisateur> role = new ArrayList<Utilisateur>();

    @OneToMany(mappedBy = "role", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnoreProperties("role")
    private List<RoleHasPermission> permission = new ArrayList<RoleHasPermission>();


    @Override
    public String getAuthority() {
        return nom;
    }
}
