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

import com.infosys.Online.recruitment.Entity.Role;
import com.infosys.Online.recruitment.Service.RoleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RoleController {
	
	@Autowired
	RoleService service;
	
	
	@GetMapping("/role")
	public List<Role> getAllRoles(){
		
		return service.getAllRoles();
		
	}
	
	@GetMapping("/role/{roleId}")
	public Optional<Role> getRoleId(@PathVariable Integer roleId){
		return service.getRoleId(roleId);
	}
	
	
	@PostMapping("/role")
	public Role addRole(@RequestBody Role role) {
		return service.addRole(role);
	}

	@PutMapping("/role/{roleId}")
	public Role updateRole(@PathVariable Integer roleId, @RequestBody Role role) throws Exception{
		return service.updateRole(roleId, role);
	}

	@DeleteMapping("/role/{roleId}")
	public void deleteRole(@PathVariable Integer roleId){
		service.deleteRole(roleId);
	}

}

