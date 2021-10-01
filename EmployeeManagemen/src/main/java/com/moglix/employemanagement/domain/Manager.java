package com.moglix.employemanagement.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class Manager extends Employee{
private String projectName;
private Double projectAmmount;
public Manager() {
	super("EMP001","John","vick",100.00,"california");
	System.out.println("manager constructor");
}
public Manager(String emp_id, String emp_firstName, String empLastName, Double empSalary, String empAddress,String projectName,
		Double projectAmmount) {
	super(emp_id, emp_firstName, empLastName, empSalary, empAddress);
	this.projectName=projectName;
	this.projectAmmount=projectAmmount;
}

@Override
public String toString() {
	return super.toString()+"Manager [projectName=" + projectName + ", projectAmmount=" + projectAmmount + "]";
}
@Override
public Double calculateSalary(Double basicSalary, Double ta, Double da, Double hra) {
	
	return (this.projectAmmount+super.calculateSalary(basicSalary, ta, da, hra));
}
}
