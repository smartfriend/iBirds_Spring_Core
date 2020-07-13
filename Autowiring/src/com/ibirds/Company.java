package com.ibirds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {

//	by this method we can skip making constructor and setter menthods and pass the dependencies using annotations
	@Autowired
	@Qualifier("it")
	Dept dept;
	
	
//	public Company(HRDepartment hr) {
//		this.hr = hr;
//	}
//	
//	public void setCompany(HRDepartment hr) {
//		this.hr = hr;
//	}
	
	public void companyWork() {
		if(dept == null) {
			System.out.println("Cannot show hr");
		}else {
			dept.work();
		}
	}
}
