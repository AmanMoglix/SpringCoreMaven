package com.moglix.employemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.EmployeeDao;
import com.moglix.employemanagement.dao.impl.EmployeeDaoImpl;
import com.moglix.employemanagement.domain.Employee;
import com.moglix.employemanagement.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public String saveOrUpdate(Employee employee) {
		return this.empDao.saveOrUpdate(employee);
	}

	@Override
	public Employee getById(String empId) {
		return empDao.getEmployeeById(empId);
	}

	@Override
	public List<Employee> getEmployeeList() {
		return empDao.getList();
	}

	@Override
	public String deleteEmployeeById(String empId) {
		return this.empDao.deleteEmployeById(empId);
	}

}
