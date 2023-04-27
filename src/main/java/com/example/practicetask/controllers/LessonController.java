package com.example.practicetask.controllers;

import com.example.practicetask.dtos.CoachLessonsDTO;
import com.example.practicetask.dtos.StudentLessonsDTO;
import com.example.practicetask.entities.Lesson;
import com.example.practicetask.services.LessonService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class LessonController {
    private final LessonService lessonService;
    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @PostMapping(value = "/lessons")
    public void create(@RequestBody Lesson lesson) {
        lessonService.insertLesson(lesson.getId_coach(), lesson.getId_group(), lesson.getDate(), lesson.getTime());
    }

    @GetMapping(value = "/lessons/{id_lesson}")
    public Lesson read(@PathVariable Long id_lesson) {
        return lessonService.getLesson(id_lesson);
    }

    @GetMapping(value = "/lessons")
    public List<Lesson> readAll() {
        return lessonService.getLessons();
    }

    @GetMapping(value = "students/{id_student}/lessons")
    public List<StudentLessonsDTO> readByStudent(@PathVariable Long id_student) {
        return lessonService.getLessonsBy(id_student);
    }

    @GetMapping(value = "coaches/{id_coach}/lessons/new")
    public List<CoachLessonsDTO> newLessons(@PathVariable Long id_coach) {
        return lessonService.getNewLessons(id_coach);
    }

    @GetMapping(value = "coaches/{id_coach}/lessons/old")
    public List<CoachLessonsDTO> oldLessons(@PathVariable Long id_coach) {
        return lessonService.getOldLessons(id_coach);
    }

    @PutMapping(value = "/lessons/{id_lesson}")
    public void update(@PathVariable Long id_lesson, @RequestBody Lesson lesson) {
        lessonService.updateLesson(lesson.getId_coach(), lesson.getId_group(), lesson.getDate(), lesson.getTime(), id_lesson);
    }

    @DeleteMapping(value = "/lessons/{id_lesson}")
    public void delete(@PathVariable Long id_lesson) {
        lessonService.deleteLesson(id_lesson);
    }
}