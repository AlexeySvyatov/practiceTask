package com.example.practicetask.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    public Long id_student;
    private String name;
    private String email;
    private String phone;
    private Long id_group;
}