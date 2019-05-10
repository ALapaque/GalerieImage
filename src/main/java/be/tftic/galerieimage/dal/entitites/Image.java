package be.tftic.galerieimage.dal.entitites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


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
	@JsonIgnoreProperties(ignoreUnknown = true,
			value = {"image"})
	private List<ImageHasCategory> category = new ArrayList<ImageHasCategory>();

	@OneToMany(mappedBy = "image", cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JsonIgnoreProperties(ignoreUnknown = true,
			value = {"image", "category"})
	private List<ImageHasMotscle> motscle = new ArrayList<ImageHasMotscle>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_utilisateur")
	@JsonIgnoreProperties("utilisateur")
	private Utilisateur utilisateur;


}