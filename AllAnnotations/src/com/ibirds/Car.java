package com.ibirds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car implements Engine{

	@Autowired
	@Value("${car.name}")
	String name;
	
	@Override
	public void start() {
		System.out.println(name + " is running");
	}

	
}
