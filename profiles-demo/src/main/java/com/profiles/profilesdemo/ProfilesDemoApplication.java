package com.profiles.profilesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication

public class ProfilesDemoApplication {

//	private String url;
	
	public static void main(String[] args) {
		SpringApplication.run(ProfilesDemoApplication.class, args);
//		String str = (String)ctx.getBean("t1");
//		System.out.println(str);
	}
	
//	@Profile(value="dev")
//	@Bean(name ="t1")
//	public String getDevBean() {
//		System.out.println(url);
//		return "dev profile";
//	}
//	
//	@Profile(value="test")
//	@Bean(name="t2")
//	public String getTestBean() {
//		System.out.println(url);
//		return "dev profile";
//	}

}
