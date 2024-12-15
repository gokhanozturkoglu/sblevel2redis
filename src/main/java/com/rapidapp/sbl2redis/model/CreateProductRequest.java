package com.rapidapp.sbl2redis.model;

import lombok.Data;

@Data
public class CreateProductRequest {
    private String name;
    private String description;
    private Integer price;
}