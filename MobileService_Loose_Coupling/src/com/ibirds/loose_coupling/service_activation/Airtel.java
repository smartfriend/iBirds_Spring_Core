package com.ibirds.loose_coupling.service_activation;

public class Airtel {

	private Service service;
	
	public Airtel(Service service) {
		this.service = service;
	}
	
	public void displayService() {
		service.acivateService();
	}
}
