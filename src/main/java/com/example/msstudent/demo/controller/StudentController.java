package com.example.msstudent.demo.controller;

import com.example.msstudent.demo.model.Student;
import com.example.msstudent.demo.model.StudentTeacher;
import com.example.msstudent.demo.service.StudentService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;



    @GetMapping("/student")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GetMapping("/studentTeacher")
    public StudentTeacher getStudentTeacher() {
        return studentService.getStudentTeacher();
    }
}
