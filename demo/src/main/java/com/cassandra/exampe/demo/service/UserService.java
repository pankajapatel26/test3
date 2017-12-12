package com.cassandra.exampe.demo.service;

import com.cassandra.exampe.demo.model.User;

public interface UserService {
	
	public User getUserById(Integer userId);
	
	public void saveUser(User user);

}
