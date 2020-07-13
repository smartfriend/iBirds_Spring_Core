package com.ibirds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String args[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Rally ral = context.getBean("rally", Rally.class);
		
		ral.displayRally();
		ral.engine.start();
	}
}
