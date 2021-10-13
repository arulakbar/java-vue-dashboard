package com.example.backend.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.example.backend.dto.ProductDto;
import com.example.backend.entity.Product;
import com.example.backend.service.ProductService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/products")
    public ResponseEntity<?> getProducts() {
        List<ProductDto> products = productService.getProducts();

        log.info("Request to get Products");

        return ResponseEntity.ok(products);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable Integer id) {
        ProductDto productDto = productService.findProductById(id);

        log.info("Request to get product: {}", productDto);

        return ResponseEntity.ok(productDto);
    }

    @PostMapping("/products")
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        log.info("Request to create Product: {}", productDto);

        ProductDto product = productService.addProduct(productDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable Integer id, @RequestBody ProductDto productDto) {
        log.info("Request to update Products: {}", productDto.getId());

        ProductDto product = productService.updateProduct(id, productDto);

        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<ProductDto> deleteProduct(@PathVariable Integer id) {
        log.info("Request to delete Products with ID : {}", id);

        productService.deleteProduct(id);

        return ResponseEntity.ok().build();
    }
}
