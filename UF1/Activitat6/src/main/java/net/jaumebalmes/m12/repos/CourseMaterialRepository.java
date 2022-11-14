package net.jaumebalmes.m12.repos;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import net.jaumebalmes.m12.entitats.CourseMaterial;

public interface  CourseMaterialRepository extends CrudRepository<CourseMaterial, Long> {
	
	public List<CourseMaterial> findAll();
}
