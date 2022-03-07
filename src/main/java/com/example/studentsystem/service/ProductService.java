package com.example.studentsystem.service;

import com.example.studentsystem.model.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);

    public List<Product> getAllProducts();

    public Product getProduct(Integer id);
}
