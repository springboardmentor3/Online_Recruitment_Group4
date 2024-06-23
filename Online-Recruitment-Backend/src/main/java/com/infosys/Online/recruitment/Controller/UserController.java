package com.infosys.Online.recruitment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Online.recruitment.Entity.User;
import com.infosys.Online.recruitment.Service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	UserService service;
	
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	
	@GetMapping("/user/{userId}")
	public Optional<User> getUserId(@PathVariable Integer userId){
		return service.getUserId(userId);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@PutMapping("/users/{userId}")
	public User updateUser(@PathVariable Integer userId, @RequestBody User user) throws Exception {
		return service.updateUser(userId, user);
	}
	
	@DeleteMapping("/users/{userId}")
	public void deleteUser(@PathVariable Integer userId) {
		service.deleteUser(userId);
	}

}
