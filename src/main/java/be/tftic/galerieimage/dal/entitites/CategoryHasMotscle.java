package be.tftic.galerieimage.dal.entitites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(CategoryHasMotscle.class)
@Table(name = "category_has_motscle")
@Data
public class CategoryHasMotscle implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_motscle")
    @JsonIgnoreProperties("category")
    private Motscle motscle;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category")
    @JsonIgnoreProperties("motscle")
    private Category category;
}
