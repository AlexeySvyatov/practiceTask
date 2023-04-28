package com.example.practicetask.controllers;

import com.example.practicetask.entities.Student;
import com.example.practicetask.services.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/students")
    public void create(@RequestBody Student student) {
        studentService.insertStudent(student.getName(), student.getEmail(), student.getPhone(), student.getId_group());
    }

    @GetMapping(value = "/students/{id_student}")
    public Student read(@PathVariable Long id_student) {
        return studentService.getStudent(id_student);
    }

    @GetMapping(value = "/students")
    public List<Student> readAll() {
        return studentService.getStudents();
    }

    @PutMapping(value = "/students/{id_student}")
    public void update(@PathVariable Long id_student, @RequestBody Student student) {
        studentService.updateStudent(student.getName(), student.getEmail(), student.getPhone(), student.getId_group(), id_student);
    }

    @DeleteMapping(value = "/students/{id_student}")
    public void delete(@PathVariable Long id_student){
        studentService.deleteStudent(id_student);
    }
}