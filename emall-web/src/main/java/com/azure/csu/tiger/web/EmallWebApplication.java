package com.azure.csu.tiger.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication(scanBasePackages = {"com.azure.csu.tiger"})
@EnableDiscoveryClient
public class EmallWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmallWebApplication.class, args);
	}

}
