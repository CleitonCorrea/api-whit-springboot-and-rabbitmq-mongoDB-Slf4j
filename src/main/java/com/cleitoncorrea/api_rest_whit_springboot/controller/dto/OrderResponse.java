package com.cleitoncorrea.api_rest_whit_springboot.controller.dto;

import com.cleitoncorrea.api_rest_whit_springboot.Entity.OrderEntity;

import java.math.BigDecimal;

public record OrderResponse(Long orderId, Long customerId, BigDecimal total) {

    public static OrderResponse fromEntity( OrderEntity entity ){
    return new OrderResponse ( entity.getOrderId () , entity.getCustomerId () , entity.getTotal ());
    }
}
