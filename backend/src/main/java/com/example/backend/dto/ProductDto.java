package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {
    private Integer id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private Long categoryId;

    public ProductDto(String name, String description, double price, Long categoryId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
    }

}
