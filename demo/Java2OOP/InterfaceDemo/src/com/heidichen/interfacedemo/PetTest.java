package com.heidichen.interfacedemo;

public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet turtle  = new Pet("Ninja Turtle", "Turtle");
		turtle.displayStatus();
		
		Cat pepper = new Cat("Pepper");
		pepper.displayStatus();
		pepper.begForFood();
		pepper.giveAffection();
		
		Dog marley = new Dog("Marley");
		marley.displayStatus();
		marley.begForFood();
		marley.giveAffection();
		
	}

}
