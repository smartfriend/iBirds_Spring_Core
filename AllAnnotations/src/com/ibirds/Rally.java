package com.ibirds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rally {
	
	@Autowired
	@Qualifier("bike")
	Engine engine;
	
	public void displayRally() {
		System.out.println("Rally is on");
	}

}
