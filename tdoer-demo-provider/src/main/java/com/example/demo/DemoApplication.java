package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoApplication {

	public static void main(String[] args) {
		Long ts = Long.valueOf("1567783932000");
		Date date = new Date(ts);
		System.out.println(ts+"---------------------"+date.toString());
		SpringApplication.run(DemoApplication.class, args);
	}

}
