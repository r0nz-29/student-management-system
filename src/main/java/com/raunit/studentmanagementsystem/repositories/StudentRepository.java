package com.raunit.studentmanagementsystem.repositories;

import com.raunit.studentmanagementsystem.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}