package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.models.MessagesModel;


public interface MessagesRepo extends CrudRepository<MessagesModel, Long>{
    
}
