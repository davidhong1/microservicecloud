package com.yuan.springcloud.microservicecloudeureka7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicecloudEureka7002Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudEureka7002Application.class, args);
	}

}
