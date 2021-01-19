package com.incode.StudentRetrieve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class StudentRetrieveApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRetrieveApplication.class, args);
	}

}
