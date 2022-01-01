package fr.mgn.demo.dae;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import fr.mgn.demo.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
	@RestResource(path="byTitle")
	public List<Produit> findByTitleContains(@Param("mc") String motcle);
	

}
