package com.moglix.employemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.moglix.employemanagement.domain.Role;
import com.moglix.employemanagement.service.RoleService;
import com.moglix.employemanagement.service.impl.RoleServiceImpl;



public class RoleController {
	@Autowired
	RoleService roleService ;

	public String saveOrUpdate(Role role) {
		return this.roleService.saveOrUpdate(role);
	}

	public Role getById(Long roleId) {
		return this.roleService.getById(roleId);
	}
	public List<Role> list(){
		return this.roleService.getList();
	}
	public String delete (Long roleId) {
		return this.roleService.deleteById(roleId);
	}
}
