package com.example.backend.entity;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "category_name")
    private String name;
    private String description;

//    @OneToMany(mappedBy = "name", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Set<Product> products;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void removeProduct(Product product) {
//        products.remove(product);
//    }

}
