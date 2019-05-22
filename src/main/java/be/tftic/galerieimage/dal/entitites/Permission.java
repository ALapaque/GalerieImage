package be.tftic.galerieimage.dal.entitites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="permission")
@NamedQuery(name="permission.findAll", query="SELECT c FROM Permission c")
@Data
public class Permission implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, name = "id_permission")
    private int id_permission;

    @Column(nullable=false, length=250)
    private String nom;

    @Column(nullable=false, length=250)
    private String description;

/*    @OneToMany(mappedBy = "permission", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnoreProperties("permission")
    private List<RoleHasPermission> permission = new ArrayList<RoleHasPermission>();*/

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonBackReference(value = "permission")
    @JoinTable(name = "RoleHasPermission", joinColumns = {
    @JoinColumn(name = "id_permission")},inverseJoinColumns = @JoinColumn(name = "id_role"))
    private List<Role> roles;



}
