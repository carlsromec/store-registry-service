package com.romec.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StoreRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreRegistryServiceApplication.class, args);
	}

}
