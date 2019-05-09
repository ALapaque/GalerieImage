package be.tftic.galerieimage.dal.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CategoriesHasMotsclesEntityPK implements Serializable {

    @Column(name = "Categories_ID")
    @Id
    private int categoriesId;

    @Column(name = "MotsCles_ID")
    @Id
    private int motsClesId;

}
