package com.greatminds.stocks.stocksservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StocksServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksServiceApplication.class, args);
	}
}
