package com.yuan.springcloud.microservicecloudproviderdept8003;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaClient
@EnableDiscoveryClient // 服务发现
@SpringBootApplication
@MapperScan("com.yuan.springcloud.microservicecloudproviderdept8003.mapper")
@EnableHystrix
@EnableCircuitBreaker
public class MicroservicecloudProviderDept8003Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudProviderDept8003Application.class, args);
	}

}
