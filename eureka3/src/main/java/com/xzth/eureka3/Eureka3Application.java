package com.xzth.eureka3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class Eureka3Application {

	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(Eureka3Application.class, args);
	}

	@RequestMapping("hello")
	public String hello(String name){
		return "hello "+name+",i am from "+port+"!";
	}
}
