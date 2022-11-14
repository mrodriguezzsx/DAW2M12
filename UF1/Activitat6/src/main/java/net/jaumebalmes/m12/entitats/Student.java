package net.jaumebalmes.m12.entitats;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //taula de la BD
public class Student {
	
	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String lastName;
	private String firstName;
	private LocalDate birthDate;
	private boolean wantsNewsletter;
	
	public Student(String lastName, String firstName, LocalDate birthDate, boolean wantsNewsletter) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.wantsNewsletter = wantsNewsletter;
	}
	
	public Student() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isWantsNewsletter() {
		return wantsNewsletter;
	}

	public void setWantsNewsletter(boolean wantsNewsletter) {
		this.wantsNewsletter = wantsNewsletter;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", birthDate=" + birthDate
				+ ", wantsNewsletter=" + wantsNewsletter + "]";
	}
	
	
	
}
