package com.utm.sas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.utm.sas.entity.Student;
import com.utm.sas.repository.StudentRepository;

@DataJpaTest
public class StudentTest {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testSaveStudent() {
		Student student = new Student("Emmanuel","Contreras","ID123456","emmanuel.contreras@test.com","Space Engineering");
		studentRepository.save(student);
	}
	
}
