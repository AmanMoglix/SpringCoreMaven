package com.moglix.employemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.UserDao;
import com.moglix.employemanagement.domain.User;
import com.moglix.employemanagement.service.UserService;


@Component
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao ;
	

	@Override
	public String saveOrUpdate(User user) {
		return userDao.saveOrUpdate(user);
	}

	@Override
	public User getById(Long userId) {
		return userDao.getById(userId);
	}

	@Override
	public List<User> getList() {
		return userDao.getList();
	}

	@Override
	public String deleteById(Long userId) {
		return userDao.deleteById(userId);
	}

}
