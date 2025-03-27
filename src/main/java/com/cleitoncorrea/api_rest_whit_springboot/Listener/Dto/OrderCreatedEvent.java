package com.cleitoncorrea.api_rest_whit_springboot.Listener.Dto;

import java.util.List;

public record OrderCreatedEvent(Long codigoPedido, Long codigoCliente, List<OrderItemEvent> items) {
}
