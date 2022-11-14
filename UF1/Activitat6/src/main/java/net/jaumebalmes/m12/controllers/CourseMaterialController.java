package net.jaumebalmes.m12.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.m12.entitats.CourseMaterial;
import net.jaumebalmes.m12.repos.CourseMaterialRepository;

@RestController
public class CourseMaterialController {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	CourseMaterialRepository courseMaterialRepo; //no cal fer new ja que ho fa Spring
	
	@GetMapping("coursesMaterial")
	public Iterable<CourseMaterial> getCourseMaterial() {
		
		return courseMaterialRepo.findAll();
	}
	
	@GetMapping("coursesMaterial/{id}")
	public CourseMaterial getCourseMaterial(@PathVariable long id) {
		
		return courseMaterialRepo.findById(id).get();
	}
}
