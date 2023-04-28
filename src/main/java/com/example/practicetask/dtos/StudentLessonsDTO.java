package com.example.practicetask.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;
import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentLessonsDTO {
    private Long lessonID;
    private String coachName;
    private Date date;
    private Time time;
}