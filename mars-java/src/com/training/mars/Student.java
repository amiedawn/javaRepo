package com.training.mars;

public class Student implements Comparable<Student> {

	String name;
	int rollNo;
	char grade;
	
	public Student(String name, int rollNo, char grade) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
//	@Override
//	public int compareTo(Student o) {
//		if (this.rollNo > o.rollNo)
//		return 1;
//		
//		else {
//			return -1;
//		}
//	}
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
		}
	}

