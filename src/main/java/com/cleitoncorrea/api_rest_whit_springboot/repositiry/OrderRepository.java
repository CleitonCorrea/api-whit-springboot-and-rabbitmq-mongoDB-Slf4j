package com.cleitoncorrea.api_rest_whit_springboot.repositiry;

import com.cleitoncorrea.api_rest_whit_springboot.Entity.OrderEntity;
import com.cleitoncorrea.api_rest_whit_springboot.controller.dto.OrderResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long > {

    Page< OrderEntity > findAllByCustomerId( Long customerId, PageRequest pageRequest );
}
