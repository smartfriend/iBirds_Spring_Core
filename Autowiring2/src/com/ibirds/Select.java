package com.ibirds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Select {
	
	@Autowired
	@Qualifier("vehicle")
	vehicle veh;
	
	
	
//	public Select(Bike bike) {
//		this.bike = bike;
//	}
//	
//	public void setStartCar(Car car) {
//		this.car = car;
//	}
	
	public void run() {
		System.out.println("select running");
		if(veh == null)
			System.out.println("Cannot start the vehicle");
		else
			veh.start();
		
			
		}
		
	}

