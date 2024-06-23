package com.infosys.Online.recruitment.Service;

import java.util.List;
import java.util.Optional;

import com.infosys.Online.recruitment.Entity.Role;

public interface RoleInterface {

	public List<Role> getAllRoles();
	
	public Role addRole(Role role);
	
	public Optional<Role> getRoleId(Integer roleId);
	
	public Role updateRole(Integer roleId, Role role) throws Exception;

	public void deleteRole(Integer roleId);

}
