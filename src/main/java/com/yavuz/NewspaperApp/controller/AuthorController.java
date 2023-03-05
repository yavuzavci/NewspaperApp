package com.yavuz.NewspaperApp.controller;

import static com.yavuz.NewspaperApp.constants.EndPoints.*;

import com.yavuz.NewspaperApp.dto.request.AuthorSaveRequestDto;
import com.yavuz.NewspaperApp.dto.response.AuthorFindAllResponseDto;
import com.yavuz.NewspaperApp.repository.entity.Author;
import com.yavuz.NewspaperApp.repository.entity.Gender;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(API+VERSION+AUTHOR)
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @PostMapping(SAVE)
    public ResponseEntity<String> save(AuthorSaveRequestDto dto){
        authorService.saveDto(dto);
        return ResponseEntity.ok("OK");
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<AuthorFindAllResponseDto>> findAll(){
        return ResponseEntity.ok(authorService.findAllResponseDtos());
    }

    @GetMapping(GETBYSTATUS)
    public ResponseEntity<List<Author>> findAllByStatus(Status status){
        return ResponseEntity.ok(authorService.findAllByStatus(status));
    }

    @GetMapping(GETBYUSERNAME)
    public ResponseEntity<Optional<Author>> findByUsername(String username){
        return ResponseEntity.ok(authorService.findByUsername(username));
    }

    @GetMapping(GETBYFULLNAME)
    public ResponseEntity<Optional<Author>> findByNameAndSurname(String name,String surname){
        return ResponseEntity.ok(authorService.findByNameAndSurname(name, surname));
    }

    @GetMapping(GETBYGENDER)
    public ResponseEntity<List<Author>> findAllByGender(Gender gender){
        return ResponseEntity.ok(authorService.findAllByGender(gender));
    }

}
