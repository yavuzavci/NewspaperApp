package com.yavuz.NewspaperApp.controller;

import static com.yavuz.NewspaperApp.constants.EndPoints.*;

import com.yavuz.NewspaperApp.repository.entity.Gender;
import com.yavuz.NewspaperApp.repository.entity.Status;
import com.yavuz.NewspaperApp.repository.entity.Subscriber;
import com.yavuz.NewspaperApp.service.SubscriberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(API+VERSION+SUBSCRIBER)
@RequiredArgsConstructor
public class SubscriberController {
    private final SubscriberService subscriberService;

    @GetMapping(GETALLBYSTATUS)
    public ResponseEntity<List<Subscriber>> findAllByStatus(Status status){
        return ResponseEntity.ok(subscriberService.findAllByStatus(status));
    }

    @GetMapping(GETBYUSERNAME)
    public ResponseEntity<Optional<Subscriber>> findByUsername(String username){
        return ResponseEntity.ok(subscriberService.findByUsername(username));
    }

    @GetMapping(GETALLBYGENDER)
    public ResponseEntity<List<Subscriber>> findAllByGender(Gender gender){
        return ResponseEntity.ok(subscriberService.findAllByGender(gender));
    }
}
