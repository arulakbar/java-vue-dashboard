package com.example.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.backend.dto.CategoryDto;
import com.example.backend.entity.Category;
import com.example.backend.mapper.CategoryMapper;
import com.example.backend.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {


    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Autowired
    CategoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    public List<CategoryDto> getCategories() {
        List<Category> categories = categoryRepository.findAll();
//        List<CategoryDto> categoryDtos = new ArrayList<>();

//        categories.forEach(category -> categoryDtos.add(new CategoryDto(category.getId(), category.getCategoryName(),
//                category.getDescription(), category.getProducts())));
//        return categoryDtos;
        return categoryMapper.toListDto(categories);
    }

    public CategoryDto findByCategoryName(String categoryName) {
        Category category = categoryRepository.findByName(categoryName).orElseThrow();
        return categoryMapper.toDto(category);
    }

    @Transactional
    public CategoryDto addCategory(CategoryDto categoryDto) {

        Category category = categoryMapper.toEntity(categoryDto);
        Category savedCategory = categoryRepository.save(category);
        return categoryMapper.toDto(category);
    }

    @Transactional
    public CategoryDto updateCategory(Long id, CategoryDto categoryDto) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isEmpty()) {
            return addCategory(categoryDto);
        }

        Category updateCategory = category.get();
//        updateCategory.setCategoryName(categoryDto.getCategoryName());
//        updateCategory.setDescription(categoryDto.getDescription());
//        updateCategory.setProducts(categoryDto.getProducts());
//
//        return categoryMapper.toCategoryDto(updateCategory);
        return categoryMapper.toDto(updateCategory);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

}
