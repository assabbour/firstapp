package fr.mgn.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	
	private Long id;
	private String title;
	private double prix;
	
	@ManyToOne
	private Categorey category;

	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(Long id, String title, double prix, Categorey category) {
		super();
		this.id = id;
		this.title = title;
		this.prix = prix;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Categorey getCategory() {
		return category;
	}

	public void setCategory(Categorey category) {
		this.category = category;
	}
	
	
	
	
}
