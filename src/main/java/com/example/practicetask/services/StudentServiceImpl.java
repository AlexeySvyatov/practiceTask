package com.example.practicetask.services;

import com.example.practicetask.entities.Student;
import com.example.practicetask.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudent(Long id_student) {
        return studentRepository.getStudent(id_student).orElseThrow();
    }

    @Override
    public List<Student> getStudents(){
        return new ArrayList<>(studentRepository.getStudents());
    }

    @Override
    public void insertStudent(String name, String email, String phone, Long id_group) {
        studentRepository.insertStudent(name, email, phone, id_group);
    }

    @Override
    public void updateStudent(String name, String email, String phone, Long id_group, Long id_student) {
        var student = studentRepository.getStudent(id_student).orElseThrow();
        studentRepository.updateStudent(name, email, phone, id_group, student.id_student);
    }

    @Override
    public void deleteStudent(Long id_student) {
        var student = studentRepository.getStudent(id_student).orElseThrow();
        studentRepository.deleteStudent(student.id_student);
    }
}