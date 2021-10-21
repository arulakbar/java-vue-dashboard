package com.example.backend.dto;

import java.util.Set;

import com.example.backend.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
//@AllArgsConstructor
@Data
public class CategoryDto {

    private Long id;
    private String name;
    private String description;
//    private Set<Product> products;

    public CategoryDto(String name, String description) {
        this.name = name;
        this.description = description;
//        this.products = products;
    }
}
