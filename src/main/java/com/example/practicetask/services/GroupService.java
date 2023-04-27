package com.example.practicetask.services;

import com.example.practicetask.entities.Group;
import java.util.List;

public interface GroupService {
    Group getGroup(Long idGroup);
    List<Group> getGroups();
    void insertGroup(int size);
    void deleteGroup(Long idGroup);
}