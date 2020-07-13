package com.ibirds;

public class Car {
	
	Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car constructor called");
	}
	
	public void startEngine() {
		if(engine == null) {
			System.out.println("Could not start the engine");
		}else {
			engine.start();
		}
	}
}
