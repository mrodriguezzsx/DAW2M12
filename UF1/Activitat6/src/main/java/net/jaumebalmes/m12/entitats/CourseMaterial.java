package net.jaumebalmes.m12.entitats;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CourseMaterial {

	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String url;
	
	/*@OneToOne
	@JsonIgnore
	private Course course;*/
	
	/*@JsonIgnore
	@ManyToOne
	private Course course;*/
	
	/*@ManyToOne(optional = false)
	@JsonIgnore
	private Course course;*/
	
	/*@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	private Course course;*/
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Course course;*/
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JsonIgnore
	private Course course;

	public CourseMaterial(long id, String url) {
		super();
		this.id = id;
		this.url = url;
	}

	public CourseMaterial() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/*public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}*/

	@Override
	public String toString() {
		return "CourseMaterial [id=" + id + ", url=" + url + "]";
	}
	
	
}
