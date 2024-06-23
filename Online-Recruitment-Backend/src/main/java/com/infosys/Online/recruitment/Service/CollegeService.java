package com.infosys.Online.recruitment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Online.recruitment.Entity.College;
import com.infosys.Online.recruitment.Repositary.CollegeRepositary;

@Service
public class CollegeService implements CollegeInterface {
	@Autowired
	CollegeRepositary repository;
	
	@Override
	public List<College> getAllColleges() {
		
		return repository.findAll();
	}

	@Override
	public College addCollege(College college) {
		
		return repository.save(college);
	}
}
