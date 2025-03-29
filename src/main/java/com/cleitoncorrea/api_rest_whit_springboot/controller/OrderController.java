package com.cleitoncorrea.api_rest_whit_springboot.controller;

import com.cleitoncorrea.api_rest_whit_springboot.controller.dto.ApiResponse;
import com.cleitoncorrea.api_rest_whit_springboot.controller.dto.OrderResponse;
import com.cleitoncorrea.api_rest_whit_springboot.controller.dto.PaginationResponse;
import com.cleitoncorrea.api_rest_whit_springboot.service.OrderService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController (OrderService orderService){
        this.orderService=orderService;
    }

    @GetMapping("/customer/{customerId}/orders")
    public ResponseEntity< ApiResponse< OrderResponse > > ListOrders(@PathVariable("customerId") Long customerId, @RequestParam(name = "page", defaultValue = "0") Integer page,
                                                                      @RequestParam(name = "pagesize", defaultValue = "10") Integer pagesize){
        var pageResponse = orderService.findAllByCudtomerId ( customerId, PageRequest.of ( page, pagesize ) );
        return ResponseEntity.ok (
                new ApiResponse<> (
                        pageResponse.getContent (),
                        PaginationResponse.fromPage ( pageResponse )
                )
        );
    }

}
