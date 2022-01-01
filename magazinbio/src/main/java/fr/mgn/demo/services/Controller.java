package fr.mgn.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.mgn.demo.dae.CategoryRepository;
import fr.mgn.demo.dae.ProduitRepository;
import fr.mgn.demo.entities.Categorey;
import fr.mgn.demo.entities.Produit;

@RestController
public class Controller {
	
	@Autowired
	private CategoryRepository cr;
	@Autowired
	private ProduitRepository pr;
	
	
//	@PostMapping("/savecategory")
//	public String addCategory() {
//		Categorey c = new Categorey();
//		cr.save(c);
//		for(var i=0; i<3; i++) {
//			Produit p = new Produit();
//			p.setTitle("produit"+i);
//			p.setPrix(10+i);
//			p.setCategory(c);
//			pr.save(p);
//		}
//		return "hello";
//	
//	}
	
	// save produit 
	
//	@RequestMapping(value = "/getall", method = RequestMethod.GET)
//	public List<Produit> getProduits(){
//		return pr.findAll();
//	}
	
	// edit
	@RequestMapping(value = "/toto/{id}", method = RequestMethod.PUT)
	public Categorey edit(@PathVariable Long id, @RequestBody Categorey c){
		c.setId(id);
		System.out.println(id + c.getName());
		return cr.save(c);
	}
	
	
	

}
