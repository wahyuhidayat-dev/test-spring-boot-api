package com.example.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.entities.Products;
import com.example.models.repos.ProductRepo;

@Service
@Transactional
public class ProductService {
    private ProductRepo productRepo;


    // create if id null or update if id not null
    public Products create(Products products)
    {
        return productRepo.save(products);
    }

    // search product by id
    public Products finProducts(Long id)
    {
        return productRepo.findById(id).get();
    }

    // get all product
    public Iterable<Products> findAll()
    {
        return productRepo.findAll();
    }

    // remove product by id
    public void remove(Long id)
    {
        productRepo.deleteById(id);
    }
}
