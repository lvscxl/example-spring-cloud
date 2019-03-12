package com.exmaple.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerWithEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerWithEurekaApplication.class, args);
	}

}
