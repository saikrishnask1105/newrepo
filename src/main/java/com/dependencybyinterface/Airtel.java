package com.dependencybyinterface;

public class Airtel {

	private Service service ;

	public Airtel(Service service) {
		super();
		this.service = service;
	}
	
	public void display()
	{
		service.providedService();
	}
}
