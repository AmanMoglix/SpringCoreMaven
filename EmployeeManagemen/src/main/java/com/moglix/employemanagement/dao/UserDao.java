package com.moglix.employemanagement.dao;

import java.util.List;

import com.moglix.employemanagement.domain.User;



public interface UserDao {
	public String saveOrUpdate(User user);

	public User getById(Long userId);

	public List<User> getList();

	public String deleteById(Long userId);
}
