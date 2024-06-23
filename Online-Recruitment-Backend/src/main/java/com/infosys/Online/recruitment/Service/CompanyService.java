package com.infosys.Online.recruitment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Online.recruitment.Entity.Company;
import com.infosys.Online.recruitment.Repositary.CompanyRepositary;

@Service
public class CompanyService implements CompanyInterface {
	
	@Autowired
	CompanyRepositary repository;
	
	@Override
	public List<Company> getAllCompany() {
		
		return repository.findAll();
	}

	@Override
	public Company addCompany(Company company) {
		
		return repository.save(company);
	}
}
