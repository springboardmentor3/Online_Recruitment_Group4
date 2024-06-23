package com.infosys.Online.recruitment.Service;

import java.util.List;
import java.util.Optional;

import com.infosys.Online.recruitment.Entity.User;

public interface UserInterface {

	public List<User> getAllUsers();
	
	public Optional<User> getUserId(Integer userId);
	
	public User addUser(User user);
	
	
	public User updateUser(Integer userId,User user) throws Exception;
	
	public void deleteUser(Integer userId);
}
