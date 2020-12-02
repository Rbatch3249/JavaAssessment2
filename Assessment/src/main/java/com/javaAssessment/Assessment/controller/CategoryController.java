package com.javaAssessment.Assessment.controller;

import com.javaAssessment.Assessment.model.Category;
import com.javaAssessment.Assessment.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET, value = "/books/category")
    public List<Category> getCategories(){
        return categoryService.getAllCategories();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/books/category/{type}")
    public Iterable<Category> getCategoryByType(@PathVariable String type){
        return categoryService.getCategoryByType(type);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books/category")
    public void addCategory(@RequestBody Category newCategory){
        categoryService.newCategory(newCategory);
    }



}
