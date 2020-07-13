package com.ibirds;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		// setting up ioc bean for Bike (literal value dependency)
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Bike bike = ac.getBean("bike", Bike.class);
//		bike.showColor();
		
		
//		setting up ioc bean for Car and Engine (object dependency)
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Car car = ac.getBean("car", Car.class);
		Bike bike = ac.getBean("bike", Bike.class);
		car.startEngine();
		bike.startEngine();
		
	}
}
