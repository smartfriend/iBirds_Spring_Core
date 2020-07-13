package com.ibirds.di.loose_coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans are boiling :\n" + context);
		System.out.println("*******************************************************"
				+ "***************************************************************");
		Student st = context.getBean("student", Student.class);
		st.displayStudent();
	}

}
