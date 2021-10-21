package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.ProductDto;
import com.example.backend.entity.Product;

import com.example.backend.repository.CategoryRepository;
import com.example.backend.service.CategoryService;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper extends EntityMapper<ProductDto,Product> {
//    Product toEntity(ProductDto productDto);

    @Override
    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);

    @Override
    @Mapping(target = "category", source = "categoryId")
    Product toEntity(ProductDto dto);
}
