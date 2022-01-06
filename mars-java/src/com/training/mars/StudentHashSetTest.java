package com.training.mars;

import java.util.HashSet;
import java.util.Set;

public class StudentHashSetTest {

	public static void main(String[] args) {
		StudentHashSet stud1 = new StudentHashSet("John", 01, 'A');
		StudentHashSet stud2 = new StudentHashSet("Maria", 02, 'B');
		StudentHashSet stud3 = new StudentHashSet("Kevin", 03, 'B');
		StudentHashSet stud4 = new StudentHashSet("Kevin", 03, 'B');
		
		Set<StudentHashSet> students = new HashSet<>();
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		students.add(stud4);
		
		// data type Student: iterate over students collection and put values into stud references
		for (StudentHashSet stud:students) {
			// iterate over collection and put name values in 
			System.out.println(stud.name + " " + stud.rollNo + " " + stud.grade );
		}
		
		
		if(stud3.equals(stud4)) {
			System.out.println("stud3 & stud4 are equal variables, and their respective hashvalues are:" + " "+ stud3.hashCode() + " & " + stud4.hashCode()); 
		}
		else {
			System.out.println("The 2 variables stud3 and stud4 are not equal. Their respective hashvalues are: " + stud3.hashCode() + " & " + stud4.hashCode()); 
		}
	}
	

}
