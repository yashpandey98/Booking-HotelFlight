package com.nagarro.service;

import com.nagarro.model.User;

public interface UserService {

	public String registerUser(User user) throws IllegalAccessException;
	
	public User loginUser(User user) throws IllegalAccessException; 
}
