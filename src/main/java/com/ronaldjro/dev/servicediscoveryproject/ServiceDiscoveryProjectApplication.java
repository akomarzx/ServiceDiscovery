package com.ronaldjro.dev.servicediscoveryproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryProjectApplication.class, args);
    }

}
