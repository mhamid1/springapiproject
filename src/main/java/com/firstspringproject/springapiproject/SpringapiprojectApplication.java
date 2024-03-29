package com.firstspringproject.springapiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringapiprojectApplication {

	public static void main(String[] args) {
		Player p = new Player();
		
		SpringApplication.run(SpringapiprojectApplication.class, args);
	}

}
