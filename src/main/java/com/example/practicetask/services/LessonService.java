package com.example.practicetask.services;

import com.example.practicetask.dtos.CoachLessonsDTO;
import com.example.practicetask.dtos.StudentLessonsDTO;
import com.example.practicetask.entities.Lesson;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

public interface LessonService {
    Lesson getLesson(Long id_lesson);
    List<Lesson> getLessons();
    void insertLesson(Long id_coach, Long id_group, Date date, Time time);
    void updateLesson(Long id_coach, Long id_group, Date date, Time time, Long id_lesson);
    void deleteLesson(Long id_lesson);
    List<StudentLessonsDTO> getLessonsBy(Long id_student);
    List<CoachLessonsDTO> getNewLessons(Long id_coach);
    List<CoachLessonsDTO> getOldLessons(Long id_coach);
}