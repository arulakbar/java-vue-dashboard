package com.example.backend;

import com.example.backend.dto.ProductDto;
import com.example.backend.entity.Category;
import com.example.backend.entity.Product;
import com.example.backend.mapper.ProductMapper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class ProductMapperTest {
    ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

    @Test
    @Disabled
    void givenProductToDto_whenMaps_thenCorrect(){
        Category category = new Category("Palaian","man");
        Product product = new Product(4,"Baju","joijoj",
                6.7, "test",category);

        ProductDto dto = mapper.toDto(product);

//        assertEquals(product.getCategory().getName(), dto.getCategoryId());
    }
}
