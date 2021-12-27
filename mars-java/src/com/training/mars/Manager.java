package com.training.mars;

// Manager takes all attributes of the Employee class
public class Manager extends Employee{
	public void getLocation() {
		System.out.println(location);
	}

	public String getEmployeeInfo() {
		return "Returning from Manager class";
	}
}
