package com.cleitoncorrea.api_rest_whit_springboot.controller.dto;

import java.util.List;

public record ApiResponse<T>(List<T> data, PaginationResponse pagination) {
}
