package be.tftic.galerieimage.dal.entitites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(RoleHasPermission.class)
@Table(name = "role_has_permission")
@Data
public class RoleHasPermission implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role")
    @JsonIgnoreProperties("permission")
    private Role role;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_permission")
    @JsonIgnoreProperties(ignoreUnknown = true,
            value = {"role", "permission"})
    private Permission permission;
}
