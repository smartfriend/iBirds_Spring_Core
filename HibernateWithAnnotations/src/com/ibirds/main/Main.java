package com.ibirds.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ibirds.pojo.Student;

public class Main {

	public static void main(String args[]) {
		Configuration config = new Configuration(); // configures jdbc driver
		config.configure().addAnnotatedClass(Student.class); // need to map the pojo class here
		
		SessionFactory sf = config.buildSessionFactory(); // starts communication with db
		Session session = sf.openSession(); // opens a session to operate CRUD
		Transaction trans = session.beginTransaction(); // starts transacting data
		
//		Student stu = new Student();
//		stu.setFirstName("Shane");
//		stu.setLastName("Warne");
//		
//		session.save(stu); // saves the data to the db
		Student stu = session.get(Student.class, 2);
		//System.out.println(stu.getId()+"\n"+stu.getFirstName()+"\n"+stu.getLastName());
		if(stu != null)
			System.out.println(stu); // when toString is used
		else
			System.out.println("No such record(s)");
		trans.commit(); // rollback the whole process if any error occurs
		//stu.display();
	}
}
