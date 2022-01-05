package com.training.mars;

import java.util.Objects;

public class StudentHashSet {
	public String name;
	public int rollNo;
	public char grade;
	
	// constructor
	public StudentHashSet(String name, int rollNo, char grade) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}
	
	// getters and setters
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
	
	@Override
	public int hashCode() {
		return Objects.hash(grade, name, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		StudentHashSet other = (StudentHashSet) obj;
		return grade == other.grade && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	
	
}