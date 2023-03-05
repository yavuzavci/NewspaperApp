package com.yavuz.NewspaperApp.repository;

import com.yavuz.NewspaperApp.repository.entity.News;
import com.yavuz.NewspaperApp.repository.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface INewsRepository extends JpaRepository<News,Long> {
    List<News> findAllByStatus(Status status);
    Optional<News> findByTitle(String title);
    List<News> findAllByAuthorId(Long authorId);
    @Query(name = "News.findAllByCategoryId",
            value = "SELECT n From News n WHERE ?1 MEMBER OF n.categoryIds")
    List<News> findAllByCategoryId(Long categoryId);
}
