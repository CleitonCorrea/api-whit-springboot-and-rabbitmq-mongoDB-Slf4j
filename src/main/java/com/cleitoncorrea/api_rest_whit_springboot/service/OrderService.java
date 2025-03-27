package com.cleitoncorrea.api_rest_whit_springboot.service;

import com.cleitoncorrea.api_rest_whit_springboot.Entity.OrderEntity;
import com.cleitoncorrea.api_rest_whit_springboot.Entity.OrderItem;
import com.cleitoncorrea.api_rest_whit_springboot.Listener.Dto.OrderCreatedEvent;
import com.cleitoncorrea.api_rest_whit_springboot.repositiry.OrderRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void save(OrderCreatedEvent event){

        var entity = new OrderEntity();
        entity.setOrderId(event.codigoPedido());
        entity.setCustomerId(event.codigoCliente());
        entity.setItems(getOrderItems(event));
        entity.setTotal(getTotal(event));

        orderRepository.save(entity);
    }

    private static List<OrderItem> getOrderItems(OrderCreatedEvent event){
        return event.items().stream()
                .map(i-> new OrderItem(i.produto(), i.quantidade(), i.preco()))
                .toList();
    }

    public BigDecimal getTotal(OrderCreatedEvent event){

        return event.items().stream()
                .map(i -> i.preco().multiply(BigDecimal.valueOf(i.quantidade())))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

}

