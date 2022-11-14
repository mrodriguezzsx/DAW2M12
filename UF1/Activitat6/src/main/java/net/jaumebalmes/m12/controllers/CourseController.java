package net.jaumebalmes.m12.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.m12.entitats.Course;
import net.jaumebalmes.m12.repos.CourseRepository;
	
	@RestController
	public class CourseController {
		
		@Autowired     //diu a Spring que crei ell l'objecte
		CourseRepository courseRepo; //no cal fer new ja que ho fa Spring
		
		@GetMapping("courses")
		public Iterable<Course> getCourse() {
			
			return courseRepo.findAll();
		}
		
		@GetMapping("courses/{id}")
		public Course getCourse(@PathVariable long id) {
			
			return courseRepo.findById(id).get();
		}
}
