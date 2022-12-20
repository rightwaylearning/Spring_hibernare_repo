package com.event.listener.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String studentname;
	private Integer studentRollNumber;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Integer getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(Integer studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", studentRollNumber=" + studentRollNumber + "]";
	}
	
	
}
