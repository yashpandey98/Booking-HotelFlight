package com.nagarro.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmail(String email);
}
