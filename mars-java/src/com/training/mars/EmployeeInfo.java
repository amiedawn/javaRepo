package com.training.mars;

public class EmployeeInfo {
	
	public static void main(String[] args) {
		// you can use constructor (only to construct the object) or using getters and setters 
		
		Employee emp1 = new Employee();
//		Manager mgr1 = new Manager();
		Employee emp = new Manager();
		
		emp1.setEmpId("E101");
		emp1.setDepartment("Sales");
		emp1.setName("John");
		emp1.setSalary(2000.12);
		
		Employee emp2 = new Employee("Kevin", 4300.09,"E102", "Marketing");
		
		System.out.println(emp1.getEmployeeInfo());
//		System.out.println(mgr1.getEmployeeInfo());
		System.out.println(emp.getEmployeeInfo());
		//System.out.println(emp2.getEmployeeInfo());
	}

}


// if the employee id already exists, then your code should display an error message
