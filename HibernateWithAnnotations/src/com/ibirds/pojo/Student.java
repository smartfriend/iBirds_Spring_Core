package com.ibirds.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //by using this annotation no need to make xml(hbm) file
@Table(name="student_by_annotation") // this will create the table with this given name
public class Student {

	@Id // this will make id as primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) // this will make id to auto-generatef
	private int id;
	@Column(name="first_name")
	private String firstName;
	
	//@Transient if we dont want last name column to be shown in db table
	@Column(name="last_name")
	private String lastName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
//	public void display() {
//		System.out.println(getId() + "\n" + getFirstName()+"\n"+getLastName());
//	}
}
