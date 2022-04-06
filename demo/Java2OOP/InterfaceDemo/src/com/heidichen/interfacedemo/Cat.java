package com.heidichen.interfacedemo;

public class Cat extends Pet implements Keepable{
	
	public Cat(String name) {
		super(name, "cat");
	}

	@Override
	public void giveAffection() {
		System.out.println(this.name + "is scratching you and trying to bite you");
		
	}

	@Override
	public void begForFood() {
		System.out.println(this.name + " is yelling at you! TIME FOR FOOD!");
		
	}
}
