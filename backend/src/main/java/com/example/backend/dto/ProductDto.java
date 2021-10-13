package com.example.backend.dto;

import com.example.backend.entity.Category;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Integer id;
    private String productName;
    private String description;
    private double price;
    private String imageUrl;
    private Category category;

    // public ProductDto(Integer id, String productName, String description, double
    // price, String imageUrl,
    // String category) {
    // this.id = id;
    // this.productName = productName;
    // this.description = description;
    // this.pmageUrl = imageUrl;
    // this.carice = price;
    // this.itegory = category;
    // }

    public ProductDto(String productName, String description, double price, String imageUrl, Category category) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
