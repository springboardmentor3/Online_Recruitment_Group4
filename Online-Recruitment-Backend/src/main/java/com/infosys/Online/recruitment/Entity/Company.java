package com.infosys.Online.recruitment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {
	 
	@Id
	 private int companyId;
	 private String companyType;
	 private String companyName;
	 private String companyDescr;
	 private String companyAddress;
	 
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Company(int companyId, String companyType, String companyName, String companyDescr,
			String companyAddress) {
		super();
		this.companyId = companyId;
		this.companyType = companyType;
		this.companyName = companyName;
		this.companyDescr = companyDescr;
		this.companyAddress = companyAddress;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDescr() {
		return companyDescr;
	}

	public void setCompanyDescr(String companyDescr) {
		this.companyDescr = companyDescr;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyType=" + companyType + ", companyName="
				+ companyName + ", companyDescr=" + companyDescr + ", companyAddress=" + companyAddress + "]";
	}
	
	
	
	
}
