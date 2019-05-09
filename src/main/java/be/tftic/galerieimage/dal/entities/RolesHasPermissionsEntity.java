package be.tftic.galerieimage.dal.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "roles_has_permissions", schema = "galerieimage", catalog = "")
@Data
@IdClass(RolesHasPermissionsEntityPK.class)
public class RolesHasPermissionsEntity {

    @Id
    @Column(name = "Roles_ID")
    private int rolesId;

    @Id
    @Column(name = "Permissions_ID")
    private int permissionsId;

    @ManyToOne
    @JoinColumn(name = "Roles_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private RolesEntity rolesByRolesId;

    @ManyToOne
    @JoinColumn(name = "Permissions_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private PermissionsEntity permissionsByPermissionsId;

}
