package com.utm.sas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "enrollment")
	private String enrollment;
	@Column(name = "email")
	private String email;
	@Column(name = "career")
	private String career;
	
	
	public Student() {

	}

	public Student(String firstName, String lastName, String enrollment, String email, String carrer) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.enrollment = enrollment;
		this.email = email;
		this.career = carrer;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCarrer() {
		return career;
	}
	public void setCarrer(String carrer) {
		this.career = carrer;
	}

	
	
}
