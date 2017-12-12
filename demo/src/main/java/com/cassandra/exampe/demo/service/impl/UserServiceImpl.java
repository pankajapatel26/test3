package com.cassandra.exampe.demo.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cassandra.exampe.demo.model.Department;
import com.cassandra.exampe.demo.model.Previleges;
import com.cassandra.exampe.demo.model.Role;
import com.cassandra.exampe.demo.model.User;
import com.cassandra.exampe.demo.repository.DepartmentRepository;
import com.cassandra.exampe.demo.repository.PrevilegesRepository;
import com.cassandra.exampe.demo.repository.RoleRepository;
import com.cassandra.exampe.demo.repository.UserRepository;
import com.cassandra.exampe.demo.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private PrevilegesRepository previlegesRepository;

	@Override
	public User getUserById(Integer userId) {
		User user = new User();
		user = userRepository.findById(userId);
		if (null != user) {
			Set<Integer> roleIds = user.getRoleIds();
			if (null != roleIds) {
				Set<Role> roles = new HashSet<>();
				roleRepository.getRoleListByRoleIds(roleIds).forEach(e -> {
					Previleges previleges = new Previleges();
					if(null != e.getPrevilegeId()) {
						previleges = previlegesRepository.findById(e.getPrevilegeId());
						e.setPrevileges(previleges);
					}
					roles.add(e);
				});
				user.setRoles(roles);
			}

			Set<Integer> deptIds = user.getDeptIds();
			if (null != deptIds) {
				Set<Department> depts = new HashSet<>();
				departmentRepository.getDeptListByIds(deptIds).forEach(e -> depts.add(e));
				user.setDepartments(depts);
			}

		}
		return user;
	}

	@Override
	public void saveUser(User user) {
		if (null != user) {
			Set<Integer> roleIds = user.getRoleIds();
			roleRepository.getRoleListByRoleIds(roleIds).forEach(role -> {
				Set<Integer> userIds = role.getUserIds();
				userIds.add(user.getId());
				roleRepository.save(role);
			});

		}
		userRepository.save(user);
	}

}
