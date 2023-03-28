package com.nagarro.service;

import java.util.List;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.UserDao;
import com.nagarro.model.User;

public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	@Autowired
	BCryptPasswordEncoder encoderPassword;

	public String registerUser(User user) throws IllegalAccessException {
		List<User> users = userDao.findAll();

		for (User user1 : users) {
			if (user1.getEmail().equals(user.getEmail())) {
				return ("Email Already Exist, try a new one");
			}
		}
		if (user.getPassword().equals(user.getConfirmPassword())) {
			user.setPassword(encoderPassword.encode(user.getPassword()));
			user.setConfirmPassword(encoderPassword.encode(user.getConfirmPassword()));
			userDao.save(user);
			return "Register Successful";
		} else {
			return ("Password missmatch, Enter again!!!");
		}
	}

	public User loginUser(User user) throws IllegalAccessException {
		User user1 = userDao.findByEmail(user.getEmail());
		if (user1.getEmail() == null) {
			throw new IllegalAccessException("Email not found!!!");
		} else if (encoderPassword.matches(user1.getPassword(), user.getPassword())) {
			return user;
		} else {
			throw new IllegalAccessException("Wrong Credential !!!");
		}
	}

}
