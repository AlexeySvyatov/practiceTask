package com.example.practicetask.dtos;

import java.sql.Date;

public class StudentLessonsDTO {
    private Long lessonID;
    private String coachName;
    private Date date;
    private String time;

    public StudentLessonsDTO(Long lessonID, String coachName, Date date, String time) {
        this.lessonID = lessonID;
        this.coachName = coachName;
        this.date = date;
        this.time = time;
    }

    public Long getLessonID() {
        return lessonID;
    }
    public void setLessonID(Long lessonID) {
        this.lessonID = lessonID;
    }

    public String getCoachID() {
        return coachName;
    }
    public void setCoachID(String coachName) {
        this.coachName = coachName;
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