package com.kelaskoding.controllers;

import java.util.Optional;

import com.kelaskoding.models.entities.Category;
import com.kelaskoding.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category create(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }

    @GetMapping
    public Iterable<Category> findAll(){
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Category findOne(@PathVariable("id") Long id){
        Optional<Category> category = categoryService.findOne(id);
        if(!category.isPresent()){
            return null;
        }
        return category.get();
    }
}
