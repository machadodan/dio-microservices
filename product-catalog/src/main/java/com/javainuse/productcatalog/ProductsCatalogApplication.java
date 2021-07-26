package com.javainuse.productcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductsCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run( ProductsCatalogApplication.class, args);
	}

}
