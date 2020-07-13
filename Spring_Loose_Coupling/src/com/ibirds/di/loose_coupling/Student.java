package com.ibirds.di.loose_coupling;

public class Student {

	private int id;
	private String name;
	private Subject subject;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public void displayStudent() {
		System.out.println("Student Id: " + id);
		System.out.println("Student name: " + name);
		subject.startStudy();
	}
}
