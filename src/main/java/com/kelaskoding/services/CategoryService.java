package com.kelaskoding.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.kelaskoding.models.entities.Category;
import com.kelaskoding.models.repositories.CategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryService {
    
    @Autowired
    private CategoryRepo repo;

    public Category saveCategory(Category category){
        return repo.save(category);
    }

    public Iterable<Category> findAll(){
        return repo.findAll();
    }

    public Optional<Category> findOne(Long id){
        return repo.findById(id);
    }
}
