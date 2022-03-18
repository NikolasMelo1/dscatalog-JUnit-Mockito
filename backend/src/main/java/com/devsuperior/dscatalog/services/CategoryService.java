package com.devsuperior.dscatalog.services;

import com.devsuperior.dscatalog.Repositories.CategoryRepository;
import com.devsuperior.dscatalog.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
}
