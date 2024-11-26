package com.utm.sas.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.utm.sas.entity.Student;
import com.utm.sas.repository.StudentRepository;
import com.utm.sas.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}
