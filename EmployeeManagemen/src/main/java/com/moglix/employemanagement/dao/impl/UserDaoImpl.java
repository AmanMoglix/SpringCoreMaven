package com.moglix.employemanagement.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.UserDao;
import com.moglix.employemanagement.domain.User;


@Component
public class UserDaoImpl implements UserDao {
	private List<User> users = new ArrayList<User>();

	@Override
	public String saveOrUpdate(User user) {
		if (this.getById(user.getUserId()) != null) {
			for (User it : users) {
				if (it != null && it.getUserId() == user.getUserId()) {
					it.setEmail(user.getEmail());
					it.setRoleId(user.getRoleId());
					it.setUserName(user.getUserName());
					it.setUserPassword(user.getUserPassword());
				}
			}
			return "Entity Updated successfully by userId " + user.getUserId() + "";
		} else {
			this.users.add(user);
		}
		return "Entity Persisted successfully ";
	}

	@Override
	public User getById(Long userId) {
		for (User user : users) {
			if (user != null && user.getUserId() == userId) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getList() {
		return users;
	}

	@Override
	public String deleteById(Long userId) {
		User user = this.getById(userId);
		if (user != null) {
			this.users.remove(user);
			return "Entity Deleted Successfully by userId : " + userId + "";

		} else
//		this.counter = 0;
//		for (User user : users) {
//			if (user != null && user.getUserId() == userId) {
//				users[counter] = null;
//				return "Deleted Successfully by userId : " + userId + "";
//			} else {
//				counter++;
//			}
//		}
			return "Deletion not performed";
	}

}
