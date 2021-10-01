package com.moglix.employemanagement.dao.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.EmployeeDao;
import com.moglix.employemanagement.domain.Employee;


@Component
public class EmployeeDaoImpl implements EmployeeDao {
	

	
	
//	private static int counter = 0;
//	Employee employees[] = new Employee[10];
	private List<Employee> employees=new ArrayList<Employee>();

	@Override
	public String saveOrUpdate(Employee employee) {
//		if (counter < employees.length) {
//			employees[counter++] = employee;
//			return "successfully added ..!";
//		} else {
//			return "Array is Full";
//		}
		if(this.getEmployeeById(employee.getEmp_id())!=null) {
			for (Employee emp : employees) {
				if(employee!=null && emp.getEmp_id()==employee.getEmp_id()) {
					emp.setEmp_firstName(employee.getEmp_firstName());
					emp.setEmpLastName(employee.getEmpLastName());
					emp.setEmpSalary(employee.getEmpSalary());
					emp.setEmpAddress(employee.getEmpAddress());
				}	
			}
			return "Entity updated successfully";
		}else {
			this.employees.add(employee);
			return "Entity persisted Successfully";
		}
	}

	@Override
	public Employee getEmployeeById(String empId) {
		for (Employee emp : employees) {
			if (emp != null && emp.getEmp_id().equalsIgnoreCase(empId)) {
				return emp;
			}
		}
		return null;
	}



	@Override
	public List<Employee> getList() {
		return employees;
	}

	@Override
	public String deleteEmployeById(String empId) {
		Employee employee=this.getEmployeeById(empId);
		if(employee!=null) {
			this.employees.remove(employee);
			return "Entity Deleted Successfully By empId"+empId+"";
		}
//		this.counter=0;
//		for(Employee emp:employees) {
//			if(emp!=null && emp.getEmp_id().equalsIgnoreCase(empId)) {
//				this.employees[counter]=null;
//				return "Deleted SuccessFully";
//			}else {
//				counter++;
//			}
//		}
		
		return "Deletion Failed  ..!";
	}

//	public static Employee[] removeTheEmployee(Employee[] arr, int index) {
//
//
////		if (arr == null || index < 0 || index >= arr.length) {
////			System.out.println("helllo");
////			return arr;
////		}
//		Employee[] employeeUpdated = new Employee[arr.length - 1];
//
//		for (int i = 0, k = 0; i < arr.length; i++) {
//
//
//			if (i == index) {
//				System.out.println("i = "+i +" ==" +"j :"+index);
//				continue;
//			}
//
//			employeeUpdated[k] = arr[i++];
//		}
//        System.out.println(employeeUpdated.length);
//		return employeeUpdated;
//	}
}
