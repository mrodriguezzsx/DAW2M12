package net.jaumebalmes.m12.entitats;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity //taula de la BD
public class Course {
	
	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	
	/*@OneToOne(mappedBy = "course")
	private CourseMaterial courseMaterial;*/
	
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CourseMaterial> courseMaterial;
	
	public Course(long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public Course() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<CourseMaterial> getCourseMaterial() {
		return courseMaterial;
	}

	public void setCourseMaterial(List<CourseMaterial> courseMaterial) {
		this.courseMaterial = courseMaterial;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + "]";
	}
	
}
