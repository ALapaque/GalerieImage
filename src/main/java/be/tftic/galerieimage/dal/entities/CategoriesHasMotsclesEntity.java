package be.tftic.galerieimage.dal.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "categories_has_motscles", schema = "galerieimage", catalog = "")
@Data
@IdClass(CategoriesHasMotsclesEntityPK.class)
public class CategoriesHasMotsclesEntity {

    @Id
    @Column(name = "Categories_ID")
    private int categoriesId;

    @Id
    @Column(name = "MotsCles_ID")
    private int motsClesId;


    @ManyToOne
    @JoinColumn(name = "Categories_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private CategoriesEntity categoriesByCategoriesId;

    @ManyToOne
    @JoinColumn(name = "MotsCles_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private MotsclesEntity motsclesByMotsClesId;
}
