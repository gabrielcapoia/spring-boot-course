package com.eureka.course.services;

import com.eureka.course.entities.Category;
import com.eureka.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> optCategory = repository.findById(id);
        return optCategory.get();
    }
}
