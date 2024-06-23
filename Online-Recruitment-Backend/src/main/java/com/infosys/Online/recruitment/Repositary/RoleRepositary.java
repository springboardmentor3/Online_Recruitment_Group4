package com.infosys.Online.recruitment.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.Online.recruitment.Entity.Role;

public interface RoleRepositary extends JpaRepository<Role, Integer> {
	

}
