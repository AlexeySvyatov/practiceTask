package com.example.practicetask.repositories;

import com.example.practicetask.entities.Group;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface GroupRepository extends CrudRepository<Group, Long> {
    @Query("select * from groups where id_group = :id")
    Optional<Group> getGroup(@Param("id") Long id_group);

    @Query("select * from groups")
    List<Group> getGroups();

    @Modifying
    @Query("insert into groups (size) values (:size)")
    void insertGroup(@Param("size") int size);

    @Modifying
    @Query("delete from groups where id_group = :id")
    void deleteGroup(@Param("id") Long id_group);
}