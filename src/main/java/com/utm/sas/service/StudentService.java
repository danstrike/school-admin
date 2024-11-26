package com.utm.sas.service;

import java.util.List;

import com.utm.sas.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
}
