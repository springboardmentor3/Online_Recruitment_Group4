package com.infosys.Online.recruitment.Service;

import java.util.List;

import com.infosys.Online.recruitment.Entity.Employer;

public interface EmployerInterface {
	public List<Employer> getAllEmployer();
	public Employer addEmployer(Employer employer);
}
