package com.example.practicetask.entities;

import org.springframework.data.annotation.Id;

public class Student {
    @Id
    public Long id_student;
    private String name;
    private String email;
    private String phone;

    public Long getId() {
        return id_student;
    }
    public void setId(Long id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}