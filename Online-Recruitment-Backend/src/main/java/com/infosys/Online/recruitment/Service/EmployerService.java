package com.infosys.Online.recruitment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Online.recruitment.Entity.Employer;
import com.infosys.Online.recruitment.Repositary.EmployerRepositary;

@Service
public class EmployerService implements EmployerInterface {
	@Autowired
	EmployerRepositary repository;
	
	@Override
	public List<Employer> getAllEmployer() {
		
		return repository.findAll();
	}

	@Override
	public Employer addEmployer(Employer employer) {
		
		return repository.save(employer);
	}
}
