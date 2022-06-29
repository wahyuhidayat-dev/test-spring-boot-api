package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.MessagesModel;
import com.example.repository.MessagesRepo;

@RestController
@RequestMapping("/v1")
public class MessagesController {
    @Autowired
    MessagesRepo messagesRepo;

    @GetMapping("/messages")
    public Iterable<MessagesModel> getAll()
    {
        return messagesRepo.findAll();
    }

    @PostMapping("/messages")
    public MessagesModel create(@RequestBody MessagesModel messagesModel)
    {
        return messagesRepo.save(messagesModel);
    }

    @DeleteMapping("/messages")
    void Delete(){
        messagesRepo.deleteAll();
    }

}
