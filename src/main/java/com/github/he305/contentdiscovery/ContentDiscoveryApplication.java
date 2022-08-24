package com.github.he305.contentdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ContentDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentDiscoveryApplication.class, args);
	}

}
