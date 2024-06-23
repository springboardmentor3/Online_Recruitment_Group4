package com.infosys.Online.recruitment.Service;

import java.util.List;

import com.infosys.Online.recruitment.Entity.Company;

public interface CompanyInterface {
	public List<Company> getAllCompany();
	public Company addCompany(Company company);
}
