package be.tftic.galerieimage.dal.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class RolesHasPermissionsEntityPK implements Serializable {

    @Column(name = "Roles_ID")
    @Id
    private int rolesId;

    @Column(name = "Permissions_ID")
    @Id
    private int permissionsId;

}
