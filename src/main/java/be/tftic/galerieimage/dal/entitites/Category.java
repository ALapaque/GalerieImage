package be.tftic.galerieimage.dal.entitites;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the categories database table.
 * 
 */
@Entity
@Table(name="category")
@NamedQuery(name="category.findAll", query="SELECT c FROM Category c")
@Data
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, name = "id_category")
	private int id_category;

	@Column(nullable=false, length=250)
	private String nom;

	@OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<ImagesHasCategories> category = new ArrayList<ImagesHasCategories>();


}