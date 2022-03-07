package com.example.studentsystem.service;

import com.example.studentsystem.model.User;

import java.util.List;


// Service Layer (Business Logic)

public interface UserService {
    public User saveUser(User user);

    public List<User> getAllUsers();

    public User getUser(Long id);

}
