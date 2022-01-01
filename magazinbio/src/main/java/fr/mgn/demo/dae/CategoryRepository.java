package fr.mgn.demo.dae;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.mgn.demo.entities.Categorey;

public interface CategoryRepository extends JpaRepository<Categorey, Long>{

}
