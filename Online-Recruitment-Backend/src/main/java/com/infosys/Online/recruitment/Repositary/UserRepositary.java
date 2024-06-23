package com.infosys.Online.recruitment.Repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.Online.recruitment.Entity.User;

public interface UserRepositary extends JpaRepository<User, Integer> {

	User save(Optional<User> existingUser);

	
}
