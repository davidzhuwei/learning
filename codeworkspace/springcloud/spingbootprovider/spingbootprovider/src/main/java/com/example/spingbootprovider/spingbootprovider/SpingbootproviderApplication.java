package com.example.spingbootprovider.spingbootprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpingbootproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingbootproviderApplication.class, args);
	}
}
