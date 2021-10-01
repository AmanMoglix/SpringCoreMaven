package com.moglix.employemanagement.dao;

import java.util.List;

import com.moglix.employemanagement.domain.Employee;



public interface EmployeeDao {
public String saveOrUpdate(Employee employee);
public Employee getEmployeeById(String empId);
//public String updateEployee(Employee employee,String empId);
public List<Employee> getList();
public String deleteEmployeById(String empId);

}
