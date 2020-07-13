package com.ibirds;

public class EmployeeBusiness {

	Employee emp;
	
	public EmployeeBusiness() {
		emp = new Employee();
	}
	
	// business logic show all records from employees table
	public void showAllRecords() {
		String selectQuery = "select * from employees";
		emp.showDatabase(selectQuery);
	}
	
	// business logic to insert new records in employee table
	public void insertRecords(String name, String department, long mobile, char gender) {
		try {
			String insertQuery = "insert into employees (name, department, mobile, gender) values('"+name+"','"+department+"','"+mobile+"','"+gender+"')";
			if(emp.crudDatbase(insertQuery))
				System.out.println("Record inserted successfuly");
			else
				System.out.println("Unable to insert record");
		}catch(Exception e) {
			System.out.println("From EmployeeBusiness.java while inserting records");
			e.printStackTrace();
		}
	}
	
	// business logic to update existing records in employees table
	public void updateRecords(int emp_id, long mobile) {
		String updateQuery = "update employees set mobile='"+mobile+"' where emp_id='"+emp_id+"';";

		if(emp.crudDatbase(updateQuery)) {
			System.out.println("mobile updated successfully for id " + emp_id);
		}else {
			System.out.println("Update unsuccessful");
		}
	}
	
	// business logic to delete a record from employee table
	public void deleteRecord(int emp_id) {
		String deleteQuery = "delete from employees where emp_id='"+emp_id+"'";
		if(emp.crudDatbase(deleteQuery)) {
			
		}else {
			System.out.println("No record found with Id " +emp_id);
		}
	}
	
}
