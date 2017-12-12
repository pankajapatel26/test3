package com.cassandra.exampe.demo.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cassandra.exampe.demo.model.Role;
import com.cassandra.exampe.demo.model.User;
import com.cassandra.exampe.demo.repository.RoleRepository;
import com.cassandra.exampe.demo.repository.UserRepository;
import com.cassandra.exampe.demo.service.RoleService;

@Component
public class RoleServiceImpl implements RoleService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role getRoleById(Integer roleId) {
		Role role = new Role();
		role = roleRepository.findById(roleId);
		if (null != role) {
			Set<Integer> userIds = role.getUserIds();
			Set<User> users = new HashSet<>();
			userRepository.getUserListByUserIds(userIds).forEach(e -> users.add(e));
			role.setUsers(users);
		}
		return role;
	}

	@Override
	public void saveRole(Role role) {
		roleRepository.save(role);
	}

}
