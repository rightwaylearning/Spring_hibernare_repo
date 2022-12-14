package pack1.test;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public Student() {
		System.out.println("I am default");
	}

	public String getMessage() {
		return "Hi good morning india...";
	}
}
