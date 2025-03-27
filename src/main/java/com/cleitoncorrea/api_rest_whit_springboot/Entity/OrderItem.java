package com.cleitoncorrea.api_rest_whit_springboot.Entity;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;

public class OrderItem {

    private String product;
    private Integer quantity;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal preco;

    public OrderItem ( String product , Integer quantity , BigDecimal preco ) {
        this.product = product;
        this.quantity = quantity;
        this.preco = preco;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
