package com.cleitoncorrea.api_rest_whit_springboot.repositiry;

import com.cleitoncorrea.api_rest_whit_springboot.Entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long > {
}
