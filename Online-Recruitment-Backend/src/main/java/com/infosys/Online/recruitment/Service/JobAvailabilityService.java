package com.infosys.Online.recruitment.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.infosys.Online.recruitment.Entity.JobAvailability;
import com.infosys.Online.recruitment.Repositary.JobAvailabilityRepositary;
@Service
public class JobAvailabilityService implements JobAvailabilityInterface {
	@Autowired
	JobAvailabilityRepositary repository;
	
	@Override
	public List<JobAvailability> getAllJobAvailability() {
		
		return repository.findAll();
	}

	public JobAvailability getJobAvailabilityById(Integer id) {
        return repository.findById(id).orElse(null);
    }

	
	@Override
	public JobAvailability saveJobAvailability(JobAvailability jobavailability,  MultipartFile file) throws IOException {
		
		jobavailability.setResumeData(file.getBytes());
		jobavailability.setResumeFilename(file.getOriginalFilename());
		jobavailability.setResumeFileType(file.getContentType());
		
		return repository.save(jobavailability);
	}
}
