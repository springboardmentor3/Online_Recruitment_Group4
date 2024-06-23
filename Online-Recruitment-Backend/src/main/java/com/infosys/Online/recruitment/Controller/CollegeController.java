package com.infosys.Online.recruitment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Online.recruitment.Entity.College;
import com.infosys.Online.recruitment.Service.CollegeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CollegeController {

	@Autowired
	CollegeService service;
	
	
	@GetMapping("/college")
	public List<College> getAllColleges(){
		
		return service.getAllColleges();
		
	}
	
	
	@PostMapping("/college")
	public College addCollege(@RequestBody College college) {
		return service.addCollege(college);
	}
}
