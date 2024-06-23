package com.infosys.Online.recruitment.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.infosys.Online.recruitment.Entity.JobAvailability;


public interface JobAvailabilityInterface {
	
	public List<JobAvailability> getAllJobAvailability();
	
	public JobAvailability saveJobAvailability(JobAvailability jobavailability, MultipartFile file) throws IOException;
}
