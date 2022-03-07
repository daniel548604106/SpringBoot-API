package com.example.studentsystem.controller;


import com.example.studentsystem.model.User;
import com.example.studentsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller (API Layer) talks to the Service Layer (Business Logic) , and then Service Layer talks to the Data Access Layer
@RestController
@RequestMapping("/api/users") // Any request that starts with student , doens't matter which method of the request
public class UserController {

    // Reference to  UserService
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        System.out.println("Request Coming!");
        // this will reach for getAllUsers in UserService (Business Logic)
        return userService.getAllUsers();
    }

    // Post Request  // Request Body 需要被轉成 Java 能懂得 Object
    @PostMapping("/add") // @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object.
    public String add(@RequestBody User user){ // This function takes in the request body of a student type
        userService.saveUser(user); // Add students into database using the service
        return "New user is added"; // After added to DB successfully , return a message back
    }

    // Get Request
    @GetMapping("/getAll")
    public List<User> getAllStudents(){ // this function returns a list of Student
        return userService.getAllUsers();
    }


    @GetMapping("/user/{id}")
    public User getStudent(@PathVariable("id") Long id){

        System.out.println(id);
        return userService.getUser(id);
    }

}
