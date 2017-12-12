package com.cassandra.exampe.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cassandra.exampe.demo.model.Role;
import com.cassandra.exampe.demo.model.User;
import com.cassandra.exampe.demo.repository.RoleRepository;
import com.cassandra.exampe.demo.repository.UserRepository;
import com.cassandra.exampe.demo.service.RoleService;
import com.cassandra.exampe.demo.service.UserService;

@RestController
public class AuthenticationController {

	@RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	public String home() {
		return "Nothing here. Go to <a href='/sample'>/sample</a>";
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> greeting() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(e -> users.add(e));
		return users;
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String saveUser(@RequestBody User user) {
		userService.saveUser(user);
		return "SUCCESS";
	}

	@RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
	public User getUserById(@PathVariable("userId") Integer userId) {
		return userService.getUserById(userId);
	}

	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	public List<Role> getAllRoles() {
		List<Role> roles = new ArrayList<>();
		roleRepository.findAll().forEach(e -> roles.add(e));
		return roles;
	}

	@RequestMapping(value = "/roles/{roleId}", method = RequestMethod.GET)
	public Role getRoleById(@PathVariable("roleId") Integer roleId) {
		return roleService.getRoleById(roleId);
	}

	@RequestMapping(value = "/roles", method = RequestMethod.POST)
	public String saveRole(@RequestBody Role role) {
		roleService.saveRole(role);
		return "SUCCESS";
	}

}
