package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithH2DbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithH2DbApplication.class, args);
		System.out.println("Changing Server from Tomcat to Jetty running on port number 8585...");
	}

	//  Check in pom.xml file todo the Server Change

}
