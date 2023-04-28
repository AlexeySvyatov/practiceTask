package com.example.practicetask.repositories;

import com.example.practicetask.entities.Student;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    @Query("select * from students where id_student = :id")
    Optional<Student> getStudent(@Param("id") Long id_student);

    @Query("select * from students")
    List<Student> getStudents();

    @Modifying
    @Query("insert into students (name, email, phone, id_group) values (:name, :email, :phone, :id_group)")
    void insertStudent(@Param("name") String name, @Param("email") String email, @Param("phone") String phone, @Param("id_group") Long id_group);

    @Modifying
    @Query("update students set name = :name, email = :email, phone = :phone, id_group = :id_group where id_student = :id")
    void updateStudent(@Param("name") String name, @Param("email") String email, @Param("phone") String phone, @Param("id_group") Long id_group, @Param("id") Long id_student);

    @Modifying
    @Query("delete from students where id_student = :id")
    void deleteStudent(@Param("id") Long id_student);
}