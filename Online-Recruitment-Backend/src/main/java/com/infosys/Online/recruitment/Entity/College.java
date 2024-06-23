package com.infosys.Online.recruitment.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
 @Entity
public class College {
	 @Id
	 private int collegeId;
	private String collegeName;
	private String collegeAddress;
	private String collegeDescp;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int collegeId, String collegeName, String collegeAddress, String collegeDescp) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.collegeDescp = collegeDescp;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	public String getCollegeDescp() {
		return collegeDescp;
	}
	public void setCollegeDescp(String collegeDescp) {
		this.collegeDescp = collegeDescp;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeAddress=" + collegeAddress
				+ ", collegeDescp=" + collegeDescp + "]";
	}
	


}
