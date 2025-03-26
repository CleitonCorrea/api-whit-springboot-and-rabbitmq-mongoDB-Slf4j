package com.cleitoncorrea.api_rest_whit_springboot.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String ORDER_CREATED_QUEUE = "cleitoncorrea-order-created";
}
