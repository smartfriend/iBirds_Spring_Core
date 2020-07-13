package com.ibirds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Value("${company.name}")
	String companyName;
	@Autowired
	@Qualifier("softwareEngineer")
	Engineer engineer;
	
//	@Autowired
//	@Qualifier("hardwareEngineer")
//	Engineer engineer2;
	
	public void displayCompany() {
		System.out.println("this is " + companyName);
	}
}
