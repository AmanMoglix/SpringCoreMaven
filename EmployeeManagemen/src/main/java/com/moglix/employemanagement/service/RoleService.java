package com.moglix.employemanagement.service;

import java.util.List;

import com.moglix.employemanagement.domain.Role;



public interface RoleService {
	public String saveOrUpdate(Role Role);

	public Role getById(Long roleId);

	public List<Role> getList();

	public String deleteById(Long roleId);
}
