package com.infosys.Online.recruitment.Service;

import java.util.List;

import com.infosys.Online.recruitment.Entity.College;

public interface CollegeInterface {
	public List<College> getAllColleges();
	public College addCollege(College college);
}
