package com.pearson.webassist.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class WebassistDemoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebassistDemoConfigServerApplication.class, args);
	}
}
