package com.example.practicetask;

import java.util.List;

public interface StudentService {
    void create(Student student);
    List<Student> readAll();
    Student read(int id);
    boolean update(Student student, int id);
    boolean delete(int id);
}
