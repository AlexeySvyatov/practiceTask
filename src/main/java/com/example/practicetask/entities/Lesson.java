package com.example.practicetask.entities;

import org.springframework.data.annotation.Id;
import java.sql.Date;

public class Lesson {
    @Id
    public Long id_lesson;
    private Long id_coach;
    private Long id_group;
    private Date date;
    private String time;

    public Long getId_lesson() {
        return id_lesson;
    }
    public void setId_lesson(Long id_lesson) {
        this.id_lesson = id_lesson;
    }

    public Long getId_coach() {
        return id_coach;
    }
    public void setId_coach(long id_coach) {
        this.id_coach = id_coach;
    }

    public Long getId_group() {
        return id_group;
    }
    public void setId_group(Long id_group) {
        this.id_group = id_group;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
}