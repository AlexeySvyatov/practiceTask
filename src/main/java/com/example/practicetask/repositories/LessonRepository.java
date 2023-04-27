package com.example.practicetask.repositories;

import com.example.practicetask.dtos.CoachLessonsDTO;
import com.example.practicetask.dtos.StudentLessonsDTO;
import com.example.practicetask.entities.Lesson;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Long> {
    @Query("select * from lessons where id_lesson = :id")
    Optional<Lesson> getLesson(@Param("id") Long id_lesson);

    @Query("select * from lessons")
    List<Lesson> getLessons();

    @Query("select id_lesson as id, c.name as coach, date, time from lessons as l join coaches as c on l.id_coach = c.id_coach join groups as g on l.id_group = g.id_group join students as s on g.id_group = s.id_group where id_student = :id")
    List<StudentLessonsDTO> getLessonsBy(@Param("id") Long id_student);

    @Query("select id_lesson, id_group, date, time from lessons where date > CURRENT_DATE and id_coach = :id_coach")
    List<CoachLessonsDTO> getNewLessons(@Param("id_coach") Long id_coach);

    @Query("select id_lesson, id_group, date, time from lessons where date < CURRENT_DATE and id_coach = :id_coach")
    List<CoachLessonsDTO> getOldLessons(@Param("id_coach") Long id_coach);

    @Modifying
    @Query("insert into lessons (id_coach, id_group, date, time) values (:coach, :group, :date, :time)")
    void insertLesson(@Param("coach") Long id_coach, @Param("group") Long id_group, @Param("date") Date date, @Param("time") String time);

    @Modifying
    @Query("update lessons set id_coach = :coach, id_group = :group, date = :date, time = :time where id_lesson = :id")
    void updateLesson(@Param("coach") Long id_coach, @Param("group") Long id_group, @Param("date") Date date, @Param("time") String time, @Param("id") Long id_lesson);

    @Modifying
    @Query("delete from lessons where id_lesson = :id")
    void deleteLesson(@Param("id") Long id_lesson);
}