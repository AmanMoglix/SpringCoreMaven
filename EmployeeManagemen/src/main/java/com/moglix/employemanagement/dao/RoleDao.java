package com.moglix.employemanagement.dao;

import java.util.List;

import com.moglix.employemanagement.domain.Role;



public interface RoleDao {
	public String saveOrUpdate(Role Role);

	public Role getById(Long roleId);

	public List<Role> getList();

	public String deleteById(Long roleId);
}
