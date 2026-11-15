package org.flipkart.ecommerce.fraudcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FraudCheckApplicvation {
    public static void main(String[] args) {
        SpringApplication.run(FraudCheckApplicvation.class, args);
    }
}