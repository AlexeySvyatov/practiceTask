package com.example.practicetask.services;

import com.example.practicetask.dtos.CoachLessonsDTO;
import com.example.practicetask.dtos.StudentLessonsDTO;
import com.example.practicetask.entities.Lesson;
import com.example.practicetask.repositories.LessonRepository;
import org.springframework.stereotype.Service;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Service
public class LessonServiceImpl implements LessonService{
    private final LessonRepository lessonRepository;
    public LessonServiceImpl(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public Lesson getLesson(Long id_lesson) {
        return lessonRepository.getLesson(id_lesson).orElseThrow();
    }

    @Override
    public List<Lesson> getLessons() {
        return new ArrayList<>(lessonRepository.getLessons());
    }

    @Override
    public List<StudentLessonsDTO> getLessonsBy(Long id_student) {
        return new ArrayList<>(lessonRepository.getLessonsBy(id_student));
    }

    @Override
    public List<CoachLessonsDTO> getNewLessons(Long id_coach) {
        return new ArrayList<>(lessonRepository.getNewLessons(id_coach));
    }

    @Override
    public List<CoachLessonsDTO> getOldLessons(Long id_coach) {
        return new ArrayList<>(lessonRepository.getOldLessons(id_coach));
    }

    @Override
    public void insertLesson(Long id_coach, Long id_group, Date date, Time time) {
        lessonRepository.insertLesson(id_coach, id_group, date, time);
    }

    @Override
    public void updateLesson(Long id_coach, Long id_group, Date date, Time time, Long id_lesson) {
        var lesson = lessonRepository.getLesson(id_lesson).orElseThrow();
        lessonRepository.updateLesson(id_coach, id_group, date, time, lesson.id_lesson);
    }

    @Override
    public void deleteLesson(Long id_lesson) {
        var lesson = lessonRepository.getLesson(id_lesson).orElseThrow();
        lessonRepository.deleteLesson(lesson.id_lesson);
    }
}