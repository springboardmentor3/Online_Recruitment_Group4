package com.infosys.Online.recruitment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Online.recruitment.Entity.Job;
import com.infosys.Online.recruitment.Service.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JobController {

	@Autowired
	JobService service;
	
	@GetMapping("/jobs")
	public List<Job> getAllJobs(){
		return service.getAllJobs();
	}
	
	@GetMapping("/jobs/{jobId}")
	public Optional<Job> getJobId(@PathVariable Integer jobId){
		return service.getJobId(jobId);
		
	}
	
	 @GetMapping("/employer/{employerId}")
	    public List<Job> getJobsByEmployer(@PathVariable int employerId) {
	        return service.findByEmployerId(employerId);
	    }
	
	@PostMapping("/jobs")
	public Job addJob(@RequestBody Job job) {
		return service.addJob(job);
	}
	
	
	
	@PutMapping("/jobs/{jobId}")
	public Job updateJob(@PathVariable Integer jobId, @RequestBody Job job) throws Exception{
		return service.updateJob(jobId, job);
		
	}

	@DeleteMapping("/jobs/{jobId}")
	public void deleteJob(@PathVariable Integer jobId) {
		service.deleteJob(jobId);
	}
}
