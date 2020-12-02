package com.javaAssessment.Assessment.service;

import com.javaAssessment.Assessment.model.Category;
import com.javaAssessment.Assessment.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        List<Category> categoryList = new ArrayList<>();
        categoryRepository.findAll().forEach(categoryList::add);
        return categoryList;
    }

    public Category newCategory(Category category){
        return categoryRepository.save(category);
    }
    public Iterable<Category> getCategoryByType(String type){
        return categoryRepository.findAllCategories(type);
    }


}
