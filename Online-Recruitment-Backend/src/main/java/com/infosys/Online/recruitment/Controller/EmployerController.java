package com.infosys.Online.recruitment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Online.recruitment.Entity.Employer;
import com.infosys.Online.recruitment.Service.EmployerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployerController {
	@Autowired
	EmployerService service;
	
	
	@GetMapping("/employer")
	public List<Employer> getAllEmployer(){
		
		return service.getAllEmployer();
		
	}
	
	
	@PostMapping("/employer")
	public Employer addEmployer(@RequestBody Employer employer) {
		return service.addEmployer(employer);
	}
}
