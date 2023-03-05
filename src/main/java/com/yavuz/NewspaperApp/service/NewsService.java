package com.yavuz.NewspaperApp.service;

import com.yavuz.NewspaperApp.dto.request.NewsSaveRequestDto;
import com.yavuz.NewspaperApp.dto.response.NewsFindAllResponseDto;
import com.yavuz.NewspaperApp.mapper.INewsMapper;
import com.yavuz.NewspaperApp.repository.INewsRepository;
import com.yavuz.NewspaperApp.repository.entity.News;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NewsService extends ServiceManager<News,Long> {
    private final INewsRepository repository;

    public NewsService(INewsRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<NewsFindAllResponseDto> findAllResponseDtos(){
        List<NewsFindAllResponseDto> result = new ArrayList<>();
        findAll().forEach(news -> {
            result.add(INewsMapper.INSTANCE.fromNews(news));
        });
        return result;
    }

    public News saveDto(NewsSaveRequestDto dto){
        return save(INewsMapper.INSTANCE.fromNewsSaveRequestDto(dto));
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
