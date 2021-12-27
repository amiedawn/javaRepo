package com.training.mars;

public class Employee { //POJO: plain old Java objects  java beans

	// 
	
	// data should always be private
	private String name;
	private double salary;
	private String empId;
	private String department;
	
	String location = "NY";
	
	public Employee() {
		
	}
	
	public Employee(String name,double salary, String empId, String department) {
		this.department = department;
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getEmployeeInfo() {
		return "Name: "+name+" EmpId: "+empId+ " Salary: "+salary+" Department: "+department;
	}
}
