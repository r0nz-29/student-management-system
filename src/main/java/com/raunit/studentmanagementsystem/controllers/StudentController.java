package com.raunit.studentmanagementsystem.controllers;

import java.util.List;

import com.raunit.studentmanagementsystem.models.Formdata;
import com.raunit.studentmanagementsystem.models.Student;
import com.raunit.studentmanagementsystem.services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/addStudent")
    public List<Student> AddStudent(@RequestBody Formdata requestBody) {
        return studentService.addStudent(requestBody);
    }
}
