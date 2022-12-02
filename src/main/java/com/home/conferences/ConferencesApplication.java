package com.home.conferences;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConferencesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ConferencesApplication.class, args);
	}

}
