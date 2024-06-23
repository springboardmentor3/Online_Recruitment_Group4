package com.infosys.Online.recruitment.Service;

import java.util.List;
import java.util.Optional;

import com.infosys.Online.recruitment.Entity.Job;

public interface JobInterface {

	public List<Job> getAllJobs();
	
	public Job addJob(Job job);
	
	public Optional<Job> getJobId(Integer jobId);
	
	public Job updateJob(Integer jobId, Job job) throws Exception;

	 public void deleteJob(Integer jobId);
}
