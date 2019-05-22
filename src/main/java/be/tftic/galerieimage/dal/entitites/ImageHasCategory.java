package be.tftic.galerieimage.dal.entitites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(ImageHasCategory.class)
@Table(name = "image_has_category")
@Data
public class ImageHasCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_image")
    @JsonIgnoreProperties("category")
    private Image image;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category")
    @JsonIgnoreProperties(ignoreUnknown = true,
            value = {"image", "motscle"})
    private Category category;

}
