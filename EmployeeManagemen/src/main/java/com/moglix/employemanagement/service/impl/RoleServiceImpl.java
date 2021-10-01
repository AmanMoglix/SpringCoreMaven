package com.moglix.employemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.RoleDao;
import com.moglix.employemanagement.domain.Role;
import com.moglix.employemanagement.service.RoleService;


@Component
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleDao roleDao ;


	@Override
	public String saveOrUpdate(Role Role) {
		return roleDao.saveOrUpdate(Role);
	}

	@Override
	public Role getById(Long roleId) {
		return roleDao.getById(roleId);
	}

	@Override
	public List<Role> getList() {
		return roleDao.getList();
	}

	@Override
	public String deleteById(Long roleId) {
		return roleDao.deleteById(roleId);
	}

}
