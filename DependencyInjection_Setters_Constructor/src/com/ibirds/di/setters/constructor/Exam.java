package com.ibirds.di.setters.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student setterStudent = context.getBean("setter_student", Student.class);
		Student constructorStudent = context.getBean("consntructor_student", Student.class);
		
		
		setterStudent.displayStudent();
		constructorStudent.displayStudent();
	}
}
