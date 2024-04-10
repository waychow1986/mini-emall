package com.azure.csu.tiger.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.azure.csu.tiger"})
@EnableDiscoveryClient
public class EmallWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmallWebApplication.class, args);
	}

}
