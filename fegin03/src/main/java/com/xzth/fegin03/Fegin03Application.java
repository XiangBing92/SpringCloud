package com.xzth.fegin03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Fegin03Application {

	public static void main(String[] args) {
		SpringApplication.run(Fegin03Application.class, args);
	}
}
