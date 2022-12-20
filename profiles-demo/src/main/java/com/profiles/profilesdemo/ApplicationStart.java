package com.profiles.profilesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStart implements ApplicationRunner{

	@Autowired
	ShowConnectionProperty showConnectionProperty;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println(showConnectionProperty);
		
	}

}
