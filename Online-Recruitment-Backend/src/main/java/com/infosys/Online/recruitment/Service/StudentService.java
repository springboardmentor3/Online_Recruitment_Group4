package com.infosys.Online.recruitment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.Online.recruitment.Entity.Student;
import com.infosys.Online.recruitment.Repositary.StudentRepositary;

@Service
public class StudentService implements StudentInterface {
	@Autowired
	StudentRepositary repository;
	
	@Override
	public List<Student> getAllStudents() {
		
		return repository.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		
		return repository.save(student);
	}
}
