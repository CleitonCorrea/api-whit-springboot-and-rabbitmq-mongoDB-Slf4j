package com.cleitoncorrea.api_rest_whit_springboot;

import com.mongodb.client.MongoClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class ApiRestWhitSpringbootApplication {

	public static void main(String[] args) {
		//new MongoTemplate(MongoClients.create(), "database");
		SpringApplication.run(ApiRestWhitSpringbootApplication.class, args);
	}

}
