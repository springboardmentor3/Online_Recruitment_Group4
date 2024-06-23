package com.infosys.Online.recruitment.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.Online.recruitment.Entity.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer> {

}
