package com.yavuz.NewspaperApp.service;

import com.yavuz.NewspaperApp.dto.request.SubscriberSaveRequestDto;
import com.yavuz.NewspaperApp.dto.response.SubscriberFindAllResponseDto;
import com.yavuz.NewspaperApp.mapper.ISubscriberMapper;
import com.yavuz.NewspaperApp.repository.ISubscriberRepository;
import com.yavuz.NewspaperApp.repository.entity.Gender;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.repository.entity.Subscriber;
import com.yavuz.NewspaperApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubscriberService extends ServiceManager<Subscriber,Long> {
    private final ISubscriberRepository repository;

    public SubscriberService(ISubscriberRepository repository){
        super(repository);
        this.repository = repository;
    }

    public List<SubscriberFindAllResponseDto> findAllResponseDtos(){
        List<SubscriberFindAllResponseDto> result = new ArrayList<>();
        findAll().forEach(subscriber -> {
            result.add(ISubscriberMapper.INSTANCE.fromSubscriber(subscriber));
        });
        return result;
    }

    public Subscriber saveDto(SubscriberSaveRequestDto dto){
        return save(ISubscriberMapper.INSTANCE.fromSubscriberSaveRequestDto(dto));
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
