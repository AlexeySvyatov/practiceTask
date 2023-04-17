package com.example.practicetask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses = StudentController.class)
public class PracticeTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeTaskApplication.class, args);
    }

}
