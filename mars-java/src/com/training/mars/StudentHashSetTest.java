package com.training.mars;

import java.util.HashSet;
import java.util.Set;

public class StudentHashSetTest {

	public static void main(String[] args) {
		Student stud1 = new Student("John", 01, 'A');
		Student stud2 = new Student("Maria", 02, 'B');
		Student stud3 = new Student("Kevin", 03, 'B');
		Student stud4 = new Student("Kevin", 03, 'B');
		
		Set<Student> students = new HashSet<>();
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		students.add(stud4);
		
		// data type Student: iterate over students collection and put values into stud references
		for (Student stud:students) {
			// iterate over collection and put name values in 
		//	System.out.println("Name: " + stud.getName() + " Roll No: " + stud.getRollNo());
			System.out.println(stud.name + " " + stud.rollNo + " " + stud.grade );
		}
		
		
//		if(stud3.equals(stud4)) {
//			System.out.println("stud3 & stud4 are equal variables, and their respective hashvalues are:" + " "+ stud3.hashCode() + " & " + stud4.hashCode()); 
//		}
//		else {
//			System.out.println("The 2 variables stud3 and stud4 are not equal. Their respective hashvalues are: " + stud3.hashCode() + " & " + stud4.hashCode()); 
//		}
	}
	

}
