package com.yavuz.NewspaperApp.repository;

import com.yavuz.NewspaperApp.repository.entity.Author;
import com.yavuz.NewspaperApp.repository.entity.Gender;
import com.yavuz.NewspaperApp.repository.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAuthorRepository extends JpaRepository<Author,Long> {
    List<Author> findAllByStatus(Status status);
    Optional<Author> findByUsername(String username);
    Optional<Author> findByNameAndSurname(String name,String surname);
    List<Author> findAllByGender(Gender gender);
}
