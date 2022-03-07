package com.example.studentsystem.service;

import com.example.studentsystem.model.Product;
import com.example.studentsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service // We mark beans with @Service to indicate that they're holding the business logic.  Besides being used in the service layer, there isn't any other special use for this annotation.
public class ProductServiceImpl implements ProductService{

    @Autowired // It allows Spring to resolve and inject collaborating beans into our bean. This eliminates the need for getters and setters.
    private ProductRepository productRepository; // inject our student repository to student service class


    @Override // Overriding indicates that the subclass is replacing inherited behavior. Overloading is when a subclass is adding new behavior.
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll(); // Return all students from our database
    }

    @Override
    public Product getProduct(Integer id){
        return productRepository.findById(id).get();
    }
}
