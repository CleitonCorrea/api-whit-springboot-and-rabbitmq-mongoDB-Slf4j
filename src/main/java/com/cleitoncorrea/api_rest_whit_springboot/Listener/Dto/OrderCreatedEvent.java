package com.cleitoncorrea.api_rest_whit_springboot.Listener.Dto;

import java.util.List;

public record OrderCreatedEvent(
        Long codPedido,
        Long codigoCliente,
        List<OrderItemEvent> itens) {
}
