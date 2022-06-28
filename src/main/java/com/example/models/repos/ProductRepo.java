package com.example.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.models.entities.Products;


//! CrudRepository => auto crud from springboot

public interface ProductRepo extends CrudRepository<Products, Long>{
    
}
