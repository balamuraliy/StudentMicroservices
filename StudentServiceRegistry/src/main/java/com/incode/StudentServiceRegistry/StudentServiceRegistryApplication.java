package com.incode.StudentServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class StudentServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceRegistryApplication.class, args);
	}

}
