package com.pikazza.micro.ws.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrdersMicroApplication {

public static void main(String[] args) {
	SpringApplication.run(OrdersMicroApplication.class, args);
}

}
