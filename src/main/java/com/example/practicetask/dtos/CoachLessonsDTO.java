package com.example.practicetask.dtos;

import java.sql.Date;

public class CoachLessonsDTO {
    private Long lessonID;
    private Long groupID;
    private Date date;
    private String time;

    public CoachLessonsDTO(Long lessonID, Long groupID, Date date, String time) {
        this.lessonID = lessonID;
        this.groupID = groupID;
        this.date = date;
        this.time = time;
    }

    public Long getLessonID() {
        return lessonID;
    }
    public void setLessonID(Long lessonID) {
        this.lessonID = lessonID;
    }

    public Long getGroupID() {
        return groupID;
    }
    public void setGroupID(Long groupID) {
        this.groupID = groupID;
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