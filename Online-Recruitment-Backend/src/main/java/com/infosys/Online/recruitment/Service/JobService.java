package com.infosys.Online.recruitment.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Online.recruitment.Entity.Job;
import com.infosys.Online.recruitment.Repositary.JobRepositary;

@Service
public class JobService implements JobInterface {
	
	@Autowired
	private JobRepositary repositary;
	
	@Override
	public List<Job> getAllJobs(){
		return repositary.findAll();
	}
	
	@Override
	public Job addJob(Job job) {
		return repositary.save(job);
	}

	@Override
	public Optional<Job> getJobId(Integer jobId){
		return repositary.findById(jobId);
	}
	
	@Override
	public Job updateJob(Integer jobId, Job job) throws Exception{
		Optional<Job> existingJobOptional = repositary.findById(jobId);
		
		if(existingJobOptional.isPresent()) {
			
			Job existingJob = existingJobOptional.get();

			existingJob.setJobName(job.getJobName());
			existingJob.setJobType(job.getJobType());
			existingJob.setJobVaccancy(job.getJobVaccancy());
			
			return repositary.save(existingJob);
		}
		else {
			
		throw new Exception("Role Not Found");
		
		     }
	}
	
	
	 public List<Job> findByEmployerId(int employerId) {
	        return repositary.findByEmployerId(employerId);
	    }
	
	@Override
	public void deleteJob(Integer jobId) {
		repositary.deleteById(jobId);
	}

}
