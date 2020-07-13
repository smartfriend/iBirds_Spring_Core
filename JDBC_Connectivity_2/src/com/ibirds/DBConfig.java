package com.ibirds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConfig {

	
	private String driver= "org.postgresql.Driver";
	private String url = "jdbc:postgresql://localhost:2020/school";
	private String user = "postgres";
	private String password = "1234";
	
	public void showDB() throws SQLException {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user,password);
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from students");
			
			while(result.next()) {
				System.out.println("Student ID: " + result.getInt(1));
				System.out.println("Student Name: " + result.getString(2));
				System.out.println("Student Gender: " + result.getString(3));
				System.out.println("Student Marks: " + result.getInt(4));
				System.out.println("***************************************");
				con.close();
			}
		}catch(Exception e) {
			System.out.println("Error : " + e);
		}
		
	}
	
	public boolean manipulateDB(String query) throws SQLException {
		boolean flag = true;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user,password);
			Statement stmt = con.createStatement();
			flag = stmt.executeUpdate(query) > 0 ? true : false;
			con.close();
				
		}catch(Exception e) {
			System.out.println("Error : " + e);
		}
		return flag;
	}
}
