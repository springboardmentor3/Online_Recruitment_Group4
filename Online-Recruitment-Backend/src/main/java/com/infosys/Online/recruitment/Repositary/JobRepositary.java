package com.infosys.Online.recruitment.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.Online.recruitment.Entity.Job;

public interface JobRepositary extends JpaRepository<Job, Integer> {

	List<Job> findByEmployerId(int employerId);
}
