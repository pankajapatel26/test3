package com.cassandra.exampe.demo.service;

import com.cassandra.exampe.demo.model.Role;

public interface RoleService {
	
	public Role getRoleById(Integer roleId);
	
	public void saveRole(Role role);

}
