package be.tftic.galerieimage.dal.entitites;

import lombok.Data;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the images database table.
 * 
 */
@Entity
@Table(name="image")
@NamedQuery(name="Image.findAll", query="SELECT i FROM Image i")
@Data
public class Image implements  Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, name = "id_image")
	private int id_image;

	@Column(nullable=false)
	private boolean isDeleted;

	@Column(nullable=false, length=250)
	private String description;

	@Column(nullable=false)
	private int aime;

	@Column(nullable=false, length=250)
	private String nom;

	@Column(nullable=false, length=250)
	private String src;

	@OneToMany(mappedBy = "image", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<ImagesHasCategories> image = new ArrayList<ImagesHasCategories>();



}