package com.example.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.backend.dto.ProductDto;
import com.example.backend.entity.Product;
import com.example.backend.mapper.ProductMapper;
import com.example.backend.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
//         List<ProductDto> productDtos = new ArrayList<>();

//         products.forEach(product -> productDtos
//         .add(new ProductDto(product.getId(), product.getProductName(),
//         product.getDescription(),
//         product.getPrice(), product.getImageUrl(),
//         product.getCategory().getCategoryName())));
//         return productDtos;
        return productMapper.toListDto(products);

    }

    public ProductDto findProductById(Integer id) {
        Product product = productRepository.findById(id).orElseThrow();
        return productMapper.toDto(product);
    }

    @Transactional
    public ProductDto addProduct(ProductDto productDto) {

        Product product = productMapper.toEntity(productDto);
        Product savedProduct = productRepository.save(product);
        return productMapper.toDto(savedProduct);
    }

    @Transactional
    public ProductDto updateProduct(Integer id, ProductDto productDto) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()) {
            return addProduct(productDto);
        }

        Product updateProduct = product.get();
//        updateProduct.setProductName(productDto.getProductName());
//        updateProduct.setDescription(productDto.getDescription());
//        updateProduct.setPrice(productDto.getPrice());
//        updateProduct.setImageUrl(productDto.getImageUrl());
        // updateProduct.setCategory();

//        return productMapper.toProductDto(updateProduct);
        return productMapper.toDto(updateProduct);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

}
