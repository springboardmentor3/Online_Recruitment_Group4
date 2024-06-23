package com.infosys.Online.recruitment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Online.recruitment.Entity.Company;
import com.infosys.Online.recruitment.Service.CompanyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CompanyController {

	@Autowired
	CompanyService service;
	
	
	@GetMapping("/company")
	public List<Company> getAllCompany(){
		
		return service.getAllCompany();
		
	}
	
	
	@PostMapping("/company")
	public Company addCompany(@RequestBody Company company) {
		return service.addCompany(company);
	}
}
