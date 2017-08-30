package com.example.spingCloudConfServer.spingCloudConfServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpingCloudConfServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingCloudConfServerApplication.class, args);
	}
}
