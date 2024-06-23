package com.infosys.Online.recruitment.Service;

import java.util.List;

import com.infosys.Online.recruitment.Entity.Student;

public interface StudentInterface {
	public List<Student> getAllStudents();
	public Student addStudent(Student student);
}
