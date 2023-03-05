package com.yavuz.NewspaperApp.service;

import com.yavuz.NewspaperApp.dto.request.CommentSaveRequestDto;
import com.yavuz.NewspaperApp.dto.response.CommentFindAllResponseDto;
import com.yavuz.NewspaperApp.mapper.ICommentMapper;
import com.yavuz.NewspaperApp.repository.ICommentRepository;
import com.yavuz.NewspaperApp.repository.entity.Comment;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService extends ServiceManager<Comment,Long> {
    private final ICommentRepository repository;

    public CommentService(ICommentRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<CommentFindAllResponseDto> findAllResponseDtos(){
        List<CommentFindAllResponseDto> result = new ArrayList<>();
        findAll().forEach(comment -> {
            result.add(ICommentMapper.INSTANCE.fromComment(comment));
        });
        return result;
    }

    public Comment saveDto(CommentSaveRequestDto dto){
        return save(ICommentMapper.INSTANCE.fromCommentSaveRequestDto(dto));
    }

    public List<Comment> findAllByStatus(Status status){
        return repository.findAllByStatus(status);
    }

    public List<Comment> findAllBySubscriberId(Long subscriberId){
        return repository.findAllBySubscriberId(subscriberId);
    }

    public List<Comment> findAllByNewsId(Long newsId){
        return repository.findAllByNewsId(newsId);
    }

    public List<Comment> findAllOrderByDateDesc(){
        return repository.findAllByOrderByDateDesc();
    }

    public List<Comment> findAllOrderByScoreDesc(){
        return repository.findAllByOrderByScoreDesc();
    }

    public Comment findTopByOrderByScoreDesc(){
        return repository.findTopByOrderByScoreDesc();
    }
}
