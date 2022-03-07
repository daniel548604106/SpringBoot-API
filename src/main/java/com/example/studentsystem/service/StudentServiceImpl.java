package com.example.studentsystem.service;

import com.example.studentsystem.model.Student;
import com.example.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service // We mark beans with @Service to indicate that they're holding the business logic.  Besides being used in the service layer, there isn't any other special use for this annotation.
public class StudentServiceImpl implements StudentService {

    @Autowired // It allows Spring to resolve and inject collaborating beans into our bean. This eliminates the need for getters and setters.
    private StudentRepository studentRepository; // inject our student repository to student service class


    @Override // Overriding indicates that the subclass is replacing inherited behavior. Overloading is when a subclass is adding new behavior.
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll(); // Return all students from our database
    }

    @Override
    public Student getStudent(Integer id){
        return studentRepository.findById(id).get();
    }
}
