package com.raunit.studentmanagementsystem.services;

import java.util.List;

import com.raunit.studentmanagementsystem.models.Formdata;
import com.raunit.studentmanagementsystem.models.Student;
import com.raunit.studentmanagementsystem.repositories.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student findStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> addStudent(Formdata studentData) {
        Student s = new Student(
                studentData.getName(),
                studentData.getEmail(),
                studentData.getAddress(),
                studentData.getContact());
        studentRepository.save(s);
        return this.getAllStudents();
    }

}
