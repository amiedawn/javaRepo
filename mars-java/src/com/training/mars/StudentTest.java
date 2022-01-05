package com.training.mars;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student stud1 = new Student("John", 01, 'A');
		Student stud2 = new Student("Maria", 02, 'B');
		Student stud3 = new Student("Kevin", 03, 'B');
		Student stud4 = new Student("Kevin", 03, 'B');
		
		
		List<Student> students = new ArrayList<Student>();
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		
//		Collections.sort(students); // won't work because data mixes string and integer
		Collections.sort(students); // works now because of implement
		
		// data type Student; iterate over students collection and 1-by-1 put values into stud references
		for (Student stud: students) {
			System.out.println("Name: " + stud.getName() + " Roll No: " + stud.getRollNo());
		}
		
//		Set<Student> students = new HashSet<>();
//		students.add(stud1);
//		students.add(stud2);
//		students.add(stud3);
//		students.add(stud4);
		
//		Map<String, Student> students = new HashMap<>();
//		students.put(stud1.getName(), stud1);
//		students.put(stud2.getName(), stud2);
//		students.put(stud3.getName(), stud3);
//		
//		for (Map.Entry<String, Student> entry : students.entrySet()) {
//			// getValue retrieves the hashcode value
//			// System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
//			// getValue will get actual number
//			System.out.println("Key: " + entry.getKey() + " Roll No: " + entry.getValue(). getRollNo());
//		}
		
//		for (Student stud:students) {
//			// iterate over collection and put name values in 
//			System.out.println(stud.getName());
//		}
	}

}
