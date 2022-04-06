package com.heidichen.inheritancedemo;

import java.util.ArrayList;

public class Developer {
    //attributes
    protected String name;
    protected int hunger;
    protected double hoursOfSleep;
    protected ArrayList<String> skills;


    
    // constructor
    public Developer() {
    	this.name = "A random developer";
    	this.hunger = 80;
    	this.hoursOfSleep = 6;
    	this.skills = new ArrayList<String>();
    	this.skills.add("breaking other's code");
    	
    }
    
    public Developer(String name) {
    	this.name = name;
    	this.hunger = 100;
    	this.hoursOfSleep = 7.5;
    	this.skills = new ArrayList<String>();
    	this.skills.add("Debugging skills");
    	this.skills.add("Napping");
    }
    
    
    
    
    // getters/ setters
    public String getName() {
    	return name;
    }
	public void setName(String name) {
    	this.name = name;
    }
    public int getHunger() {
    	return hunger;
    }
    public void setHunger(int hunger) {
    	this.hunger = hunger;
    }
    public double getHoursOfSleep() {
    	return hoursOfSleep;
    }
    public void setHoursOfSleep(double hoursOfSleep) {
    	this.hoursOfSleep = hoursOfSleep;
    }
    public ArrayList<String> getSkills() {
    	return skills;
    }
    public void setSkills(ArrayList<String> skills) {
    	this.skills = skills;
    }
    
    
    // other methods
    public void displayStatus() {
        System.out.println("Name: "+ this.name);
        System.out.println("Hunger: "+ this.hunger);
        System.out.println("Hours of sleep: "+ this.hoursOfSleep);
        for(String skill: this.skills) {
        	System.out.println(skill);
        }
        
    }
    
    
    
    
}
