package fr.mgn.demo.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Categorey {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "category")
	private Collection<Produit> produits;

	public Categorey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorey(Long id, String name, Collection<Produit> produits) {
		super();
		this.id = id;
		this.name = name;
		this.produits = produits;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	
	
	

}
