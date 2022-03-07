package com.example.studentsystem.controller;


import com.example.studentsystem.model.Product;
import com.example.studentsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product") // Any request that starts with student , doens't matter which method of the request
public class ProductController {
    @Autowired
    private ProductService productService;
    // this student route request has a private variable called studentService that is of type StudentService (Interface)
    //  StudentService interface :
    //  public Student saveStudent(Student student);
    //  public List<Student> getAllStudents();


    // Post Request  // Request Body 需要被轉成 Java 能懂得 Object
    @PostMapping("/add") // @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object.
    public String add(@RequestBody Product product){ // This function takes in the request body of a student type
        productService.saveProduct(product); // Add students into database using the service
        return "New student is added"; // After added to DB successfully , return a message back
    }

    // Get Request
    @GetMapping("/getAll")
    public List<Product> getAllProducts(){ // this function returns a list of Student
        return productService.getAllProducts();
    }


    @GetMapping("/user/{id}")
    public Product getProduct(@PathVariable("id") Integer id){

        System.out.println(id);
        return productService.getProduct(id);
    }

}
