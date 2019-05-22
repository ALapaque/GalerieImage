package be.tftic.galerieimage.dal.entitites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@IdClass(RoleHasPermission.class)
@Table(name = "role_has_permission")
@Data
public class RoleHasPermission implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_role")
    @JsonManagedReference(value = "role")
    private Role role;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_permission")
    @JsonManagedReference(value = "permission")
    private Permission permission;
}
