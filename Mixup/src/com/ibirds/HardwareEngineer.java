package com.ibirds;

import org.springframework.stereotype.Component;

@Component
public class HardwareEngineer implements Engineer
{

	@Override
	public void displayEngineer() {
		System.out.println("This is hardware engineer");
	}

}
