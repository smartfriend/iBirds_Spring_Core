package com.ibirds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	private String driver = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://localhost:2020/company";
	private String user = "postgres";
	private String password = "1234";
	
	private Connection con;
	private Statement stmt;
	private ResultSet result;
	
	// logic to retrieve data from employees table
	public void showDatabase(String query) {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			result = stmt.executeQuery(query);
			
			while(result.next()) {
				System.out.println("Employee details for ID : " + result.getInt(1));
				System.out.println("Name : " + result.getString(2));
				System.out.println("Gender : " + result.getString(5));
				System.out.println("Department : " + result.getString(3));
				System.out.println("Mobile : " + result.getLong(4));
				System.out.println("**************************");
				con.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	// logic to do all the CRUD operations in employees table
	public boolean crudDatbase(String query) {
		boolean flag = true;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			flag = stmt.executeUpdate(query) > 0 ? true : false;
			con.close();
		} catch (Exception e) {
			System.out.println("CRUD from Employee.java");
			e.printStackTrace();
		}
		return flag;
	}
	
}
