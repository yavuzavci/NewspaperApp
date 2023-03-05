package com.yavuz.NewspaperApp.service;

import com.yavuz.NewspaperApp.repository.INewsRepository;
import com.yavuz.NewspaperApp.repository.entity.News;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService extends ServiceManager<News,Long> {
    private final INewsRepository repository;

    public NewsService(INewsRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<News> findAllByStatus(Status status){
        return repository.findAllByStatus(status);
    }

    public Optional<News> findByTitle(String title){
        return repository.findByTitle(title);
    }

    public List<News> findAllByAuthorId(Long authorId){
        return repository.findAllByAuthorId(authorId);
    }
    public List<News> findAllByCategoryId(Long categoryId){
        return repository.findAllByCategoryId(categoryId);
    }

}
