package com.example.backend.mapper;

import com.example.backend.dto.ProductDto;
import com.example.backend.entity.Product;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
        // @Mappings({ @Mapping(target = "productName", source = "productName"),
        // @Mapping(target = "description", source = "description"), @Mapping(target =
        // "price", source = "price"),
        // @Mapping(target = "imageUrl", source = "imageUrl"), @Mapping(target =
        // "category", source = "category") })
        ProductDto toProductDto(Product product);

        // @Mappings({ @Mapping(target = "productName", source = "productName"),
        // @Mapping(target = "description", source = "description"), @Mapping(target =
        // "price", source = "price"),
        // @Mapping(target = "imageUrl", source = "imageUrl"), @Mapping(target =
        // "category", source = "category") })
        Product productDtoToProduct(ProductDto productDto);
}
