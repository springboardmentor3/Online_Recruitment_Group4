package com.infosys.Online.recruitment.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Online.recruitment.Entity.Role;
import com.infosys.Online.recruitment.Entity.User;
import com.infosys.Online.recruitment.Repositary.RoleRepositary;
import com.infosys.Online.recruitment.Repositary.UserRepositary;

@Service
public class UserService implements UserInterface {

	@Autowired
	UserRepositary repository;
	
	  @Autowired
	 RoleRepositary roleRepository;
	
	@Override
	public List<User> getAllUsers() {
		
		return repository.findAll();
	}

	@Override
	
	 public User addUser(User user) {
        // Ensure that the Role associated with the User is saved before saving the User
        Role role = user.getRole();
        if (role != null && role.getRoleId() == 0) {
            // Save the Role if it hasn't been saved yet
            roleRepository.save(role);
        }
        return repository.save(user);
    }
	
//	public User addUser(User user) {
//		
//		return repository.save(user);
//	}

	@Override
	public Optional<User> getUserId(Integer userId){
		
		return repository.findById(userId);
	}
	
	@Override
	public User updateUser(Integer userId,User user) throws Exception {
		
		Optional<User> existingUserOptional = repository.findById(userId);
		
		if(existingUserOptional.isPresent()) {
			
			User existingUser = existingUserOptional.get();
			
			existingUser.setAddress(user.getAddress());
			existingUser.setpassword(user.getpassword());
			
			return repository.save(existingUser);
		}
		else {
			
		throw new Exception("User Not Found");
		
		     }
	}
	
	@Override
	public void deleteUser(Integer userId) {
		
		repository.deleteById(userId);
	}
}
