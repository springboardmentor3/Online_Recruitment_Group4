package com.infosys.Online.recruitment.Entity;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;

@Entity
public class JobAvailability {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer jobApplicationid;

	@OneToOne(cascade =CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinColumn(name="userId")
	@JsonManagedReference
	private User user;
	
    private String name;
    private String email;
    private String phoneno;
    private String yearofpassing;
    private Double percentage;
    private String language;
    private String skills;
    private String project;

    @Lob
    @Column(name = "resume_data", columnDefinition="MEDIUMBLOB")
    private byte[] resumeData;

    private String resumeFilename;
    private String resumeFileType;
    
	public JobAvailability() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobAvailability(Integer jobApplicationid, String name, String email, String phoneno, String yearofpassing, Double percentage,
			String language, String skills, String project, byte[] resumeData, String resumeFilename,
			String resumeFileType) {
		super();
		this.jobApplicationid = jobApplicationid;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.yearofpassing = yearofpassing;
		this.percentage = percentage;
		this.language = language;
		this.skills = skills;
		this.project = project;
		this.resumeData = resumeData;
		this.resumeFilename = resumeFilename;
		this.resumeFileType = resumeFileType;
	}

	public Integer getId() {
		return jobApplicationid;
	}

	public void setId(Integer jobApplicationid) {
		this.jobApplicationid = jobApplicationid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getYearofpassing() {
		return yearofpassing;
	}

	public void setYearofpassing(String yearofpassing) {
		this.yearofpassing = yearofpassing;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public byte[] getResumeData() {
		return resumeData;
	}

	public void setResumeData(byte[] resumeData) {
		this.resumeData = resumeData;
	}

	public String getResumeFilename() {
		return resumeFilename;
	}

	public void setResumeFilename(String resumeFilename) {
		this.resumeFilename = resumeFilename;
	}

	public String getResumeFileType() {
		return resumeFileType;
	}

	public void setResumeFileType(String resumeFileType) {
		this.resumeFileType = resumeFileType;
	}

	@Override
	public String toString() {
		return "JobAvailability [jobApplicationid=" + jobApplicationid + ", name=" + name + ", email=" + email + ", phoneno=" + phoneno
				+ ", yearofpassing=" + yearofpassing + ", percentage=" + percentage + ", language=" + language
				+ ", skills=" + skills + ", project=" + project + ", resumeData=" + Arrays.toString(resumeData)
				+ ", resumeFilename=" + resumeFilename + ", resumeFileType=" + resumeFileType + "]";
	}
	
}
