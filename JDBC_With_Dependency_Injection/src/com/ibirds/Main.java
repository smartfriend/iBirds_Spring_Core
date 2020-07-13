package com.ibirds;
import java.util.Scanner;

	public class Main {
	
		public static void main(String[] args) {
			EmployeeBusiness empB = new EmployeeBusiness();
			Scanner scan = new Scanner(System.in);
			int menuOption;
			System.out.println("=====================================");
			System.out.println("Welcome to the employees portal");
			System.out.println("=====================================");
			System.out.println("Press 1 for view all employee records");
			System.out.println("Press 2 to insert new record");
			menuOption = scan.nextInt();
			scan.nextLine();
			if(menuOption == 1)
				empB.showAllRecords();
			else if(menuOption == 2) {
				System.out.println("Insert name of the employee:");
				String name = scan.nextLine();
				System.out.println("Insert gender of the employee M/F m/f:");
				char gender = scan.next().charAt(0);
				scan.nextLine();
				System.out.println("Insert department of the employee:");
				String department = scan.nextLine();
				System.out.println("Insert mobile no. of the employee:");
				long mobile = scan.nextLong();
				empB.insertRecords(name, department, mobile, gender);
			}
				
				
			
			//empB.showAllRecords();
			
		//	empB.insertRecords("Anita", "IT", 1234567890, 'F');
			//empB.updateRecords(3, 9898989898L);
			//empB.deleteRecord(1);
			//System.out.println("After deletion");
			//empB.showAllRecords();
	}	

}
