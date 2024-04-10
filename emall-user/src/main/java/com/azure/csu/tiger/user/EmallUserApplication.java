package com.azure.csu.tiger.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.azure.csu.tiger"})
@EnableDiscoveryClient
public class EmallUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmallUserApplication.class, args);
	}

}
