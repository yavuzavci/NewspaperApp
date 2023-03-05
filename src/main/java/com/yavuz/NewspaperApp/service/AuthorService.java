package com.yavuz.NewspaperApp.service;

import com.yavuz.NewspaperApp.dto.request.AuthorSaveRequestDto;
import com.yavuz.NewspaperApp.dto.response.AuthorFindAllResponseDto;
import com.yavuz.NewspaperApp.mapper.IAuthorMapper;
import com.yavuz.NewspaperApp.repository.IAuthorRepository;
import com.yavuz.NewspaperApp.repository.entity.Author;
import com.yavuz.NewspaperApp.repository.entity.Gender;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService extends ServiceManager<Author,Long> {
    private final IAuthorRepository repository;

    public AuthorService(IAuthorRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<AuthorFindAllResponseDto>findAllResponseDtos(){
        List<AuthorFindAllResponseDto> result = new ArrayList<>();
        findAll().forEach(author -> {
            result.add(IAuthorMapper.INSTANCE.fromAuthor(author));
        });
        return result;
    }

    public Author saveDto(AuthorSaveRequestDto dto){
        return save(IAuthorMapper.INSTANCE.fromAuthorSaveRequestDto(dto));
    }

    public List<Author> findAllByStatus(Status status){
        return repository.findAllByStatus(status);
    }

    public Optional<Author> findByUsername(String username){
        return repository.findByUsername(username);
    }

    public Optional<Author> findByNameAndSurname(String name,String surname){
        return repository.findByNameAndSurname(name, surname);
    }

    public List<Author> findAllByGender(Gender gender){
        return repository.findAllByGender(gender);
    }
}
