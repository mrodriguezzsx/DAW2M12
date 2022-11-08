package net.jaumebalmes.m12.repos;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import net.jaumebalmes.m12.entitats.Course;

public interface  CourseRepository extends CrudRepository<Course, Long> {
	
	public List<Course> findAll();
}
