package com.ibirds;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		BusinessLogic logic = new BusinessLogic();
		//logic.showAllData();
		
		
		//logic.insertData(3, "Shweta", "F", 275);
//		logic.updateData(3, "Shweta Sharma", "F", 300);
//		logic.showAllData();
		
		//logic.deleteData(3);
		logic.showAllData();
		
	}

}
