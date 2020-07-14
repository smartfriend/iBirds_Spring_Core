package com.ibirds.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Bike {

	private Rally rally;
	// need to have a default constructor in case we are using parameterized constructor as @Autowired
	public Bike() {
		System.out.println("Default Constructor");
	}
	// in case of constructor is available in class autowire="byName/byType will work
	//using @Autowired annotation / 
	@Autowired
	public Bike(Rally rally) {
		this.rally = rally;
		System.out.println("Parameterized constructor running");
	}
	

	// incase of setter method is available in class autowire="byName/byType will both work fine
	
	public void setRally(Rally rally) {
		this.rally = rally;
		System.out.println("Setter method running");
	}
	
	
	public void display() {
		if(rally != null) {
			rally.running();
		}else {
			System.out.println("Bike is out");
		}
		
	}
}
