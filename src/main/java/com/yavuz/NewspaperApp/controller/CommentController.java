package com.yavuz.NewspaperApp.controller;

import static com.yavuz.NewspaperApp.constants.EndPoints.*;

import com.yavuz.NewspaperApp.dto.request.CommentSaveRequestDto;
import com.yavuz.NewspaperApp.dto.response.CommentFindAllResponseDto;
import com.yavuz.NewspaperApp.repository.entity.Comment;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(API+VERSION+COMMENT)
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping(SAVE)
    public ResponseEntity<String> save(CommentSaveRequestDto dto){
        commentService.saveDto(dto);
        return ResponseEntity.ok("OK");
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<CommentFindAllResponseDto>> findAll(){
        return ResponseEntity.ok(commentService.findAllResponseDtos());
    }

    @GetMapping(GETALLBYSTATUS)
    public ResponseEntity<List<Comment>> findAllByStatus(Status status){
        return ResponseEntity.ok(commentService.findAllByStatus(status));
    }

    @GetMapping(GETBYSUBSCRIBER)
    public ResponseEntity<List<Comment>> findAllBySubscriberId(Long subscriberId){
        return ResponseEntity.ok(commentService.findAllBySubscriberId(subscriberId));
    }

    @GetMapping(GETBYNEWS)
    public ResponseEntity<List<Comment>> findAllByNewsId(Long newsId){
        return ResponseEntity.ok(commentService.findAllByNewsId(newsId));
    }

    @GetMapping(GETRECENT)
    public ResponseEntity<List<Comment>> findAllOrderByDateDesc(){
        return ResponseEntity.ok(commentService.findAllOrderByDateDesc());
    }

    @GetMapping(GETTOPCOMMENTS)
    public ResponseEntity<List<Comment>> findAllOrderByScoreDesc(){
        return ResponseEntity.ok(commentService.findAllOrderByScoreDesc());
    }

    @GetMapping(GETTOP)
    public ResponseEntity<Comment> findTopByOrderByScoreDesc(){
        return ResponseEntity.ok(commentService.findTopByOrderByScoreDesc());
    }
    
}
