package be.tftic.galerieimage.dal.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "images_has_categories", schema = "galerieimage", catalog = "")
@Data
@IdClass(ImagesHasCategoriesEntityPK.class)
public class ImagesHasCategoriesEntity {

    @Id
    @Column(name = "Images_ID")
    private int imagesId;

    @Id
    @Column(name = "Categories_ID")
    private int categoriesId;

    @ManyToOne
    @JoinColumn(name = "Images_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private ImagesEntity imagesByImagesId;

    @ManyToOne
    @JoinColumn(name = "Categories_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private CategoriesEntity categoriesByCategoriesId;
}
