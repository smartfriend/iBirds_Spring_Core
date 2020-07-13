package com.ibirds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String args[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);//ClassPathXmlApplicationContext("beans.xml");
		Company comp = context.getBean("company", Company.class);
		Info disp = context.getBean("info", Info.class);
		comp.displayCompany();
		disp.display();
		
	}
}
