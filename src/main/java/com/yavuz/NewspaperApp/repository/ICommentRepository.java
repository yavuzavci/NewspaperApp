package com.yavuz.NewspaperApp.repository;

import com.yavuz.NewspaperApp.repository.entity.Comment;
import com.yavuz.NewspaperApp.repository.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findAllByStatus(Status status);
    List<Comment> findAllBySubscriberId(Long subscriberId);
    List<Comment> findAllByNewsId(Long newsId);
    List<Comment> findAllByOrderByDateDesc();
    List<Comment> findAllByOrderByScoreDesc();
    Comment findTopByOrderByScoreDesc();
}
