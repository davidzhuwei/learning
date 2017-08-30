package com.example.spingbootconsumer.spingbootconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients    //启用feign进行远程调用
@EnableEurekaClient //启用服务注册与发现
public class SpingbootconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingbootconsumerApplication.class, args);
	}
}
