package com.sale.in;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IndianOilProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(IndianOilProjectApplication.class, args);
		
		Message m = ctx.getBean(Message.class);
		System.out.println(m.message());
		
		Student s = ctx.getBean(Student.class);
		System.out.println(s.getStudentInfo("Suresh"));
		
		DisplayMovieDetails d = ctx.getBean(DisplayMovieDetails.class);
		d.showData();
	}
	
	@Bean
	public Student getStudentObj() {
		return new Student();
	}
	
	@Bean("con")
	public Connection getConnection() throws Exception {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
	}

}
