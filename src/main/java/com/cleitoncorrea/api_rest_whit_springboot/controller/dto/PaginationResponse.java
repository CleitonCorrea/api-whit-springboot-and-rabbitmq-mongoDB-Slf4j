package com.cleitoncorrea.api_rest_whit_springboot.controller.dto;

import org.springframework.data.domain.Page;

public record PaginationResponse(
        Integer page,
        Integer pagesize,
        Long totalElements,
        Integer totalPage) {


    public static PaginationResponse fromPage( Page <?> page){
        return new PaginationResponse (
                page.getNumber (),
                page.getSize (),
                page.getTotalElements (),
                page.getTotalPages ()
        );
    }

}
