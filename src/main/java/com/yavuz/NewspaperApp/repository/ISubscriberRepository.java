package com.yavuz.NewspaperApp.repository;

import com.yavuz.NewspaperApp.repository.entity.Gender;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.repository.entity.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ISubscriberRepository extends JpaRepository<Subscriber,Long> {
    List<Subscriber> findAllByStatus(Status status);
    Optional<Subscriber> findByUsername(String username);
    List<Subscriber> findAllByGender(Gender gender);
}
