package com.ibirds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Company company = ac.getBean("company", Company.class);
		company.companyWork();
	}
}
