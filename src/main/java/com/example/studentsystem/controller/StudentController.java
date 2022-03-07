package com.example.studentsystem.controller;


import com.example.studentsystem.model.Student;
import com.example.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student") // Any request that starts with student , doens't matter which method of the request
public class StudentController {
    @Autowired
    private StudentService studentService;
    // this student route request has a private variable called studentService that is of type StudentService (Interface)
    //  StudentService interface :
    //  public Student saveStudent(Student student);
    //  public List<Student> getAllStudents();


    // Post Request  // Request Body 需要被轉成 Java 能懂得 Object
    @PostMapping("/add") // @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object.
    public String add(@RequestBody Student student){ // This function takes in the request body of a student type
        studentService.saveStudent(student); // Add students into database using the service
        return "New student is added"; // After added to DB successfully , return a message back
    }

    // Get Request
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){ // this function returns a list of Student
        return studentService.getAllStudents();
    }


    @GetMapping("/user/{id}")
    public Student getStudent(@PathVariable("id") Integer id){

        System.out.println(id);
        return studentService.getStudent(id);
    }

}
