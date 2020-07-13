package com.ibirds;

import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer implements Engineer{

	public void displayEngineer() {
		System.out.println("This is software engineer");
	}
}
