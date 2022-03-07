package com.example.studentsystem.service;

import com.example.studentsystem.model.User;
import com.example.studentsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service // We mark beans with @Service to indicate that they're holding the business logic.  Besides being used in the service layer, there isn't any other special use for this annotation.
public class UserServiceImpl implements UserService {

    @Autowired // It allows Spring to resolve and inject collaborating beans into our bean. This eliminates the need for getters and setters.
    private UserRepository userRepository; // inject our student repository to student service class


    @Override // Overriding indicates that the subclass is replacing inherited behavior. Overloading is when a subclass is adding new behavior.
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        //         return userRepository.findAll(); // Return all students from our database
        return userRepository.findAll();
    }
    @Override
    public User getUser(Long id){
        return userRepository.findById(id).get();
    }
}
