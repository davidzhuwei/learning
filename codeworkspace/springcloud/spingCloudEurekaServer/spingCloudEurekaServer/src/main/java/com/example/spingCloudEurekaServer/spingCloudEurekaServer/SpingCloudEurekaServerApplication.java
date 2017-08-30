package com.example.spingCloudEurekaServer.spingCloudEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册与发现
 * Spring could EurekaServer程序主入口
 */

@SpringBootApplication
@EnableEurekaServer
public class SpingCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingCloudEurekaServerApplication.class, args);
	}
}
