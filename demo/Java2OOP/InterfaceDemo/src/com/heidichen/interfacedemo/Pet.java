package com.heidichen.interfacedemo;

public class Pet {
	// attributes
	protected String name;
	protected String type;
	
	
	//constructor
	public Pet(String name) {
		this.name = name;
	}
	
	
	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}

	// getters/ setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// class methods
	public void displayStatus() {
		System.out.println("Name: " + this.name);
		System.out.println("Type: " + this.type);
	}
	
	
}
