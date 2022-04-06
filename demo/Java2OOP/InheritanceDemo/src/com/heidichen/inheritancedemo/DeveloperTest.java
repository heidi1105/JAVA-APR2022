package com.heidichen.inheritancedemo;

public class DeveloperTest {

	public static void main(String[] args) {
		Developer random1 = new Developer();
		Developer heidi = new Developer("Heidi");
		
		random1.displayStatus();
		heidi.displayStatus();
		
		FrontendDeveloper front1 = new FrontendDeveloper();
		front1.displayStatus();
		front1.eat();
		

	}

}
