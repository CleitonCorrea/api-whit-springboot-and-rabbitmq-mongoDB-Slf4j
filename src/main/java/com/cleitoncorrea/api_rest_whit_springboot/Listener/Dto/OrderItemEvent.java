package com.cleitoncorrea.api_rest_whit_springboot.Listener.Dto;

import java.math.BigDecimal;

public record OrderItemEvent(String produto, Integer quantidade, BigDecimal preco) {
}
