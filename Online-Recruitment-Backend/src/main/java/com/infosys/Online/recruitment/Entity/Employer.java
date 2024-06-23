package com.infosys.Online.recruitment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employer {
	@Id
	private int employerId;
	private String employerName;
	private String employerPost;
	private String employerAddress;
	private String employerMobile;
	private String employerEmail;
	
	public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employer(int employerId, String employerName, String employerPost, String employerAddress,
			String employerMobile, String employerEmail) {
		super();
		this.employerId = employerId;
		this.employerName = employerName;
		this.employerPost = employerPost;
		this.employerAddress = employerAddress;
		this.employerMobile = employerMobile;
		this.employerEmail = employerEmail;
	}
	public int getEmployerId() {
		return employerId;
	}
	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmployerPost() {
		return employerPost;
	}
	public void setEmployerPost(String employerPost) {
		this.employerPost = employerPost;
	}
	public String getEmployerAddress() {
		return employerAddress;
	}
	public void setEmployerAddress(String employerAddress) {
		this.employerAddress = employerAddress;
	}
	public String getEmployerMobile() {
		return employerMobile;
	}
	public void setEmployerMobile(String employerMobile) {
		this.employerMobile = employerMobile;
	}
	public String getEmployerEmail() {
		return employerEmail;
	}
	public void setEmployerEmail(String employerEmail) {
		this.employerEmail = employerEmail;
	}
	@Override
	public String toString() {
		return "Employer [employerId=" + employerId + ", employerName=" + employerName + ", employerPost="
				+ employerPost + ", employerAddress=" + employerAddress + ", employerMobile=" + employerMobile
				+ ", employerEmail=" + employerEmail + "]";
	}
	
	
}
