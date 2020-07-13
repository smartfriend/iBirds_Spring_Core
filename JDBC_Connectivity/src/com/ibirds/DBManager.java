package com.ibirds;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;

//import com.mysql.jdbc.Connection;

public class DBManager {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/test";
	private String user = "root";
	private String password = "";
	
	public void runDB() {
		try {
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			Statement stmt = con.createStatement();
			
			System.out.println("after stmt");
			
			ResultSet result = stmt.executeQuery("select * from test_table");
			
			System.out.println("after result");
			
			while(result.next()) {
				System.out.println("Student's name : "+ result.getString(1));
			}
			
		}catch(Exception e) {
			System.out.println("Error : " + e);
		}
	}
}
