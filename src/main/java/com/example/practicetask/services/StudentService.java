package com.example.practicetask.services;

import com.example.practicetask.entities.Student;
import java.util.List;

public interface StudentService {
    Student getStudent(Long id_student);
    List<Student> getStudents();
    void insertStudent(String name, String email, String phone);
    void updateStudent(String name, String email, String phone, Long id_student);
    void deleteStudent(Long id_student);
}