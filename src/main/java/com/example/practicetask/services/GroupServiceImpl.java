package com.example.practicetask.services;

import com.example.practicetask.entities.Group;
import com.example.practicetask.repositories.GroupRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService{
    private final GroupRepository groupRepository;
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Group getGroup(Long id_group) {
        return groupRepository.getGroup(id_group).orElseThrow();
    }

    @Override
    public List<Group> getGroups() {
        return new ArrayList<>(groupRepository.getGroups());
    }

    @Override
    public void insertGroup(int size) {
        groupRepository.insertGroup(size);
    }

    @Override
    public void deleteGroup(Long id_group) {
        var group = groupRepository.getGroup(id_group).orElseThrow();
        groupRepository.deleteGroup(group.id_group);
    }
}