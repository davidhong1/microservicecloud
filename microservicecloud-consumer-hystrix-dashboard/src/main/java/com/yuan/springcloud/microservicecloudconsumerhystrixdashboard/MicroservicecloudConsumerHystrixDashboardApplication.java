package com.yuan.springcloud.microservicecloudconsumerhystrixdashboard;

import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class MicroservicecloudConsumerHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumerHystrixDashboardApplication.class, args);
	}

}
