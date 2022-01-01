package fr.mgn.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import fr.mgn.demo.dae.CategoryRepository;
import fr.mgn.demo.dae.ProduitRepository;
import fr.mgn.demo.entities.Categorey;
import fr.mgn.demo.entities.Produit;

@SpringBootApplication
public class MagazinbioApplication implements CommandLineRunner{
	@Autowired
	private CategoryRepository cr;
	@Autowired
	private ProduitRepository pr;

	@Autowired
	private RepositoryRestConfiguration rrc;

	public static void main(String[] args) {
		SpringApplication.run(MagazinbioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		rrc.exposeIdsFor(Categorey.class);
		
		cr.save(new Categorey(null, "bio", null));
		cr.save(new Categorey(null, "local", null));
		cr.save(new Categorey(null, "export", null));
		
		
		cr.findAll().forEach(c->{
			System.out.println(c.getName());
			for(var i = 0; i<10; i++) {
				Produit p = new Produit();
				p.setTitle("produit"+i);
				p.setPrix(10+i);
				p.setCategory(c);
				pr.save(p);
			}
		});
		
		pr.findAll().forEach(p->{
			System.out.println(p.getTitle());
		});
	}

}
