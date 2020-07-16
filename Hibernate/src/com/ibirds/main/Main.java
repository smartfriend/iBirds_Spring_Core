package com.ibirds.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ibirds.pojo.Student;

public class Main {

	public static void main(String args[]) {
		Configuration con = new Configuration();
		con.configure();
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Student stu = new Student();
		stu.setFirstName("Kapil");
		stu.setLastName("Dev");
		
		session.save(stu);
		trans.commit();
		
		stu.display();
	}
	
	
}
