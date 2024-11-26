package com.utm.sas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utm.sas.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

}
