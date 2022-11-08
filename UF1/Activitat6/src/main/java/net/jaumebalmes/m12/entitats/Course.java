package net.jaumebalmes.m12.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //taula de la BD
public class Course {
	
	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String title;
	
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

	@Override
	public String toString() {
		return "Course [title=" + title + "]";
	}
	
	
	
}
