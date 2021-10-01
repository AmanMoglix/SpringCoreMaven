package com.moglix.employemanagement.domain;

import lombok.Data;

@Data
public class Employee {
	private String emp_id;
	private String emp_firstName;
	private String empLastName;
	private Double empSalary;
	private String empAddress;
	public Employee(String emp_id, String emp_firstName, String empLastName, Double empSalary, String empAddress) {
		this.a=10;
		this.emp_id = emp_id;
		this.emp_firstName = emp_firstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
	public Employee(String emp_firstName, Double empSalary, String empAddress) {
		this.a=10;
		this.emp_firstName = emp_firstName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
//	public Employee() {
//		System.out.println("inside employee");
//		//super();
//	}
	public Double calculateSalary(Double basicSalary,Double ta,Double da,Double hra) {
		Double totalSalary=0.0;
		Double percentage=(ta/100)*basicSalary;
		Double precentageda=(da/100)*basicSalary;
		Double percentagehra=(hra/100)*basicSalary;
		return (totalSalary=percentage+percentagehra+precentageda+basicSalary);
		
	}
	public final int a;
public Employee() {
	this.a=10;
}
	
}
