package com.yavuz.NewspaperApp.service;

import com.yavuz.NewspaperApp.repository.ISubscriberRepository;
import com.yavuz.NewspaperApp.repository.entity.Gender;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.repository.entity.Subscriber;
import com.yavuz.NewspaperApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriberService extends ServiceManager<Subscriber,Long> {
    private final ISubscriberRepository repository;

    public SubscriberService(ISubscriberRepository repository){
        super(repository);
        this.repository = repository;
    }

    public List<Subscriber> findAllByStatus(Status status){
        return repository.findAllByStatus(status);
    }

    public Optional<Subscriber> findByUsername(String username){
        return repository.findByUsername(username);
    }

    public List<Subscriber> findAllByGender(Gender gender){
        return repository.findAllByGender(gender);
    }
}
