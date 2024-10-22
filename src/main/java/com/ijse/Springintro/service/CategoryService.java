package com.ijse.Springintro.service;

import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.stereotype.Service;

import com.ijse.Springintro.entity.Category;

@Service
public interface CategoryService {
     List<Category>getAllCategories();
    Category createCategory(Category category);
    Category getCategoryById(Long id);
}
