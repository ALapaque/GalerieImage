package be.tftic.galerieimage.dal.entitites;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@IdClass(ImagesHasCategories.class)
@Table(name = "images_has_categories")
@Data
public class ImagesHasCategories implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_image")
    @JsonIgnoreProperties("image")
    private Image image;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category")
    @JsonIgnoreProperties("category")
    private Category category;

}
