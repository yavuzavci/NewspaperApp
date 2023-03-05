package com.yavuz.NewspaperApp.service;

import com.yavuz.NewspaperApp.repository.ICategoryRepository;
import com.yavuz.NewspaperApp.repository.entity.Category;
import com.yavuz.NewspaperApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService extends ServiceManager<Category,Long> {
    private final ICategoryRepository repository;

    public CategoryService(ICategoryRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Optional<Category> findByName(String name){
        return repository.findByName(name);
    }
}
