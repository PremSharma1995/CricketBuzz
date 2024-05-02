package com.crick.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CricketLiveBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(CricketLiveBackendApplication.class, args);
		System.out.println("Cricket App");
	}

}
