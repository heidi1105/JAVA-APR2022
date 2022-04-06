package com.heidichen.inheritancedemo;

public class FrontendDeveloper extends Developer{
	private boolean isArtistic;

	public FrontendDeveloper() {
		super(); // calling the constructor of superclass
		this.setName("A random frontend developer"); // if variable is private
		this.name= "A random frontend developer"; // variable is protected
		this.isArtistic = false;
		this.skills.add("Using Bootstrap");
	}
	

	
	public boolean isArtistic() {
		return isArtistic;
	}

	public void setArtistic(boolean isArtistic) {
		this.isArtistic = isArtistic;
	}
	
	public void displayStatus() {
		super.displayStatus();
        System.out.println("isArtistic: "+ this.isArtistic);
	}
	
	public void eat() { // when the variable is private, no direct access to variables
		this.setHunger(this.getHunger()-10);
		System.out.println("Eating something. The current hunger :" + this.getHunger());
	}
	
	
	public void drink() { // when the variable is protected, direct access to variables
		this.hunger -=10;
		System.out.println("Drinking something. The current hunger :" + this.hunger);
	}
	
}
