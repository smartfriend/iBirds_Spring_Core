package com.ibirds;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	@Value("${employee.name}")
	private String empName;
	@Value("${employee.id}")
	private int empId;
	@Value("${employee.skills}")
	private String empSkills;
	
////	@Value("Mohit")
//	@Value("${employee.name}")
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
////	@Value("111")
//	@Value("${employee.id}")
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
////	@Value("Java")
//	@Value("${employee.skills}")
//	public void setEmpSkills(String empSkills) {
//		this.empSkills = empSkills;
//	}
	
	public void showDetails() {
		System.out.println("Employee name is: "+ empName);
		System.out.println("Employee ID is: "+ empId);
		System.out.println("Employee skills are: "+ empSkills);
	}
}
