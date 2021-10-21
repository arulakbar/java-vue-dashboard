package com.example.backend.mapper;

import com.example.backend.dto.CategoryDto;
import com.example.backend.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ReferenceMapper.class})
public interface CategoryMapper extends EntityMapper<CategoryDto, Category> {
    Category toEntity(Long id);

}

