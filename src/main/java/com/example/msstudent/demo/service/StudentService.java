package com.example.msstudent.demo.service;

import com.example.msstudent.demo.model.Student;
import com.example.msstudent.demo.model.StudentTeacher;
import com.example.msstudent.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private RestTemplate restTemplate;

    public List<Student> getAll(){

        //return ( List<Student>) studentRepository.findAll();
        Student student = new Student();
        student.setDepartment("science");
        student.setId(2);
        student.setName("sita");
        List<Student> studentlist = new ArrayList<>();
        studentlist.add(student);
        return  studentlist;
    }

    public StudentTeacher getStudentTeacher(){
       // RestTemplate restTemplate = new RestTemplate();
         Teacher teacher = restTemplate.getForObject("http://teacher-service/teacher", Teacher.class);
        Student student = new Student();
        student.setDepartment("science");
        student.setId(2);
        student.setName("sita");
        StudentTeacher studentTeacher = new StudentTeacher();
        studentTeacher.setStudent(student);
        studentTeacher.setTeacher(teacher);
        return  studentTeacher;
    }
}


