package com.ibirds;

import java.sql.SQLException;

public class BusinessLogic {
	
	DBConfig config;
	public BusinessLogic() {
		config = new DBConfig();
	}
	
	
	public void showAllData() {
		try {
			config.showDB();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertData(int student_id, String name, String gender, int marks) {
		try {
			String insertQuery = "insert into students (student_id, name, gender, marks) values('"+student_id+"','"+name+"', '"+gender+"', '"+marks+"')";
			if(config.manipulateDB(insertQuery))
				System.out.println("Records updated successfully");
			else
				System.out.println("No Records updated");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void updateData(int student_id, String name, String gender, int marks) {
		String updateQuery = "update students set name='"+name+"', gender='"+gender+"', marks='"+marks+"' where student_id='"+student_id+"'";
		try {
			if(config.manipulateDB(updateQuery))
				System.out.println("Record Updated with the id no. :" + student_id+"\n\n*************************");
			else
				System.out.println("No Record Updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteData(int student_id) {
		String updateQuery = "delete from students where student_id='"+student_id+"'";
		try {
			if(config.manipulateDB(updateQuery))
				System.out.println("Record Deleted with the id no. :" + student_id+"\n\n*************************");
			else
				System.out.println("No Record Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
