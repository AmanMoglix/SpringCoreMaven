package com.moglix.employemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.moglix.employemanagement.domain.Employee;
import com.moglix.employemanagement.service.EmployeeService;
import com.moglix.employemanagement.service.impl.EmployeeServiceImpl;



public class EmployeeController {
	@Autowired
	EmployeeService empService ;

	public String addEmployee(Employee employee) {
		return this.empService.saveOrUpdate(employee);
	}

	public Employee getById(String empId) {
		return this.empService.getById(empId);
	}

	public List<Employee> getList() {
		return this.empService.getEmployeeList();
	}

	public String deleteEmployeeById(String empId) {
		return this.empService.deleteEmployeeById(empId);
	}
}
