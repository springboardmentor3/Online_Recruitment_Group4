package com.infosys.Online.recruitment.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.Online.recruitment.Entity.Role;
import com.infosys.Online.recruitment.Repositary.RoleRepositary;

@Service
public class RoleService implements RoleInterface {

	@Autowired
	RoleRepositary repository;

	@Override
	public List<Role> getAllRoles() {
		
		return repository.findAll();
	}

	@Override
	public Role addRole(Role role) {
		
		return repository.save(role);
	}
	
	@Override
	public Optional<Role> getRoleId(Integer roleId){
		return repository.findById(roleId);
	}

	@Override
	public Role updateRole(Integer roleId,Role role) throws Exception {
		
		Optional<Role> existingRoleOptional = repository.findById(roleId);
		
		if(existingRoleOptional.isPresent()) {
			
			Role existingRole = existingRoleOptional.get();

			existingRole.setRoleTitle(role.getRoleTitle());
			existingRole.setRoleDesc(role.getRoleDesc());
			
			return repository.save(existingRole);
		}
		else {
			
		throw new Exception("Role Not Found");
		
		     }
	}

	@Override
	public void deleteRole(Integer roleId){
		repository.deleteById(roleId);
	}
}
