package com.ibirds.loose_coupling.service_activation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans Started Juggling\n**********************");
		Airtel airtel = context.getBean("airtel", Airtel.class);
		airtel.displayService();
	}
}
