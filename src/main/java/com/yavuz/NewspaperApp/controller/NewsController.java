package com.yavuz.NewspaperApp.controller;

import static com.yavuz.NewspaperApp.constants.EndPoints.*;

import com.yavuz.NewspaperApp.repository.entity.News;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(API+VERSION+NEWS)
@RequiredArgsConstructor
public class NewsController {
    private final NewsService newsService;

    @GetMapping(GETALLBYSTATUS)
    public ResponseEntity<List<News>> findAllByStatus(Status status){
        return ResponseEntity.ok(newsService.findAllByStatus(status));
    }

    @GetMapping(GETBYTITLE)
    public ResponseEntity<Optional<News>> findByTitle(String title){
        return ResponseEntity.ok(newsService.findByTitle(title));
    }

    @GetMapping(GETBYAUTHOR)
    public ResponseEntity<List<News>> findAllByAuthorId(Long authorId){
        return ResponseEntity.ok(newsService.findAllByAuthorId(authorId));
    }

    @GetMapping(GETALLBYCATEGORYNAME)
    public ResponseEntity<List<News>> findAllByCategoryName(Long categoryId){
        return ResponseEntity.ok(newsService.findAllByCategoryId(categoryId));
    }
}
