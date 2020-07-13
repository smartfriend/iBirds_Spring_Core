package com.ibirds.di.object.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student", Student.class);
		AnotherStudent anotherStu = context.getBean("anotherStudent", AnotherStudent.class);
		student.displayStudent();
		anotherStu.displayStudent();
		
	}
}
