package com.example.springCloudApp.springCloudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableAutoConfiguration
@ComponentScan(value = {"com.example.springCloudApp.springCloudApp"})//组件扫描
@EnableDiscoveryClient
public class SpringCloudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAppApplication.class, args);
	}
}
