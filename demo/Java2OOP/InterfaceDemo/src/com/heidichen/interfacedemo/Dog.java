package com.heidichen.interfacedemo;

public class Dog extends Pet implements Keepable {
	
	
	public Dog(String name) {
		super(name, "dog");
	}

	@Override
	public void giveAffection() {
		System.out.println(this.name+ " is cuddling you. ");

	}

	@Override
	public void begForFood() {
		System.out.println(this.name + " is crying for food. ");
	}

}
