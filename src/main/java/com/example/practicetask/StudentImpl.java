package com.example.practicetask;

import com.example.practicetask.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    private final Repository repository;

    public StudentImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void create(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> readAll() {
        return repository.findAll();
    }

    @Override
    public Student read(int id) {
        return repository.getOne(id);
    }

    @Override
    public boolean update(Student student, int id) {
        if (repository.existsById(id)) {
            student.setId(id);
            repository.save(student);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
