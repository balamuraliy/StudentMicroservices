package com.incode.StudentAPIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class StudentApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApiGatewayApplication.class, args);
	}

}
