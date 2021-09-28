package com.example.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.backend.dto.ProductDto;
import com.example.backend.entity.Product;
import com.example.backend.exception.GlobalExceptionHandler;
import com.example.backend.mapper.ProductMapper;
import com.example.backend.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductDto> getProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();

        products.forEach(product -> productDtos.add(new ProductDto(product.getId(), product.getProductName(),
                product.getDescription(), product.getPrice(), product.getImageUrl(), product.getCategory())));
        return productDtos;
    }

    public ProductDto findProductById(Integer id) {
        Product product = productRepository.findById(id).orElseThrow();
        return productMapper.toProductDto(product);
    }

    @Transactional
    public ProductDto addProduct(ProductDto productDto) {
        Product product = productMapper.productDtoToProduct(productDto);
        Product savedProduct = productRepository.save(product);
        return productMapper.toProductDto(savedProduct);
    }

    @Transactional
    public ProductDto updateProduct(Integer id, ProductDto productDto) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()) {
            return addProduct(productDto);
        }

        Product updateProduct = product.get();
        updateProduct.setProductName(productDto.getProductName());
        updateProduct.setDescription(productDto.getDescription());
        updateProduct.setPrice(productDto.getPrice());
        updateProduct.setImageUrl(productDto.getImageUrl());
        updateProduct.setCategory(productDto.getCategory());

        return productMapper.toProductDto(updateProduct);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

}
