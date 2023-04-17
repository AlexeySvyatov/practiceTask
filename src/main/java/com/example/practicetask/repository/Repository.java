package com.example.practicetask.repository;

import com.example.practicetask.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Student, Integer>  {
}
