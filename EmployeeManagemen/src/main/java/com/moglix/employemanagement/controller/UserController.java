package com.moglix.employemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.moglix.employemanagement.domain.User;
import com.moglix.employemanagement.service.UserService;


public class UserController {
	@Autowired
	UserService userService ;

	public String saveOrUpdate(User user) {
		return this.userService.saveOrUpdate(user);
	}

	public User getById(Long userId) {
		return this.userService.getById(userId);
	}

	public List<User> list() {
		return this.userService.getList();
	}

	public void delete(Long userId) {
		this.userService.deleteById(userId);
		;
	}
}
