package com.event.listener.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerListener implements CommandLineRunner {

	@Autowired
	Student student;
	
	@Override
	public void run(String... args) throws Exception {
		
		student.setStudentname("AB");
		student.setStudentRollNumber(23);
		System.out.println(student);
		
	}

}
