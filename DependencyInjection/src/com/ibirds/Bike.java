package com.ibirds;

public class Bike {

	Engine engine;
	
	public Bike(Engine engine) {
		this.engine = engine;
		System.out.println("Bike's Constructor");
	}
	
	public void startEngine() {
		if(engine == null) {
			System.out.println("Could not start engine");
		}else {
			engine.start();
		}
	}
	
//	String color;
	
//	use of constructor on literal values
//	public Bike(String color) {
//		this.color = color;
//		System.out.println("Constructor");
//	}

	
//	use of setter method  
//	public void setColor(String color) {
//		this.color = color;
//		System.out.println("Setter Method");
//	}
	
	
//	public void showColor() {
//		System.out.println("Bike's color is : "+ color);
//	}
}
