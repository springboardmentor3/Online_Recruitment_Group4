package com.infosys.Online.recruitment.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@JsonProperty("studentId")
	private int studentId;
	
	   @JsonProperty("studentName")
	private String studentName;
	   @JsonProperty("studentMobile")
	private String studentMobile;
	   @JsonProperty("studentEmail")
	private String studentEmail;
	   @JsonProperty("studentAddress")
	private String studentAddress;
	   @JsonProperty("studentGender")
	private String studentGender;
	   
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentMobile, String studentEmail, String studentAddress,
			String studentGender) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentEmail = studentEmail;
		this.studentAddress = studentAddress;
		this.studentGender = studentGender;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMobile=" + studentMobile
				+ ", studentEmail=" + studentEmail + ", studentAddress=" + studentAddress + ", studentGender="
				+ studentGender + "]";
	}
		
	
}
