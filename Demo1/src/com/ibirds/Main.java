package com.ibirds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys{
	public void run(Engine key) {
		key.start();
	}
}

public class Main {

	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Engine key = (Engine)ac.getBean("engine");
		new Keys().run(key);
	}
}
