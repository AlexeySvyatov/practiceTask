package com.example.practicetask.controllers;

import com.example.practicetask.entities.Group;
import com.example.practicetask.services.GroupService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class GroupController {
    private final GroupService groupService;
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping(value = "/groups")
    public void create(@RequestBody Group group) {
        groupService.insertGroup(group.getSize());
    }

    @GetMapping(value = "/groups/{id_group}")
    public Group read(@PathVariable Long id_group) {
        return groupService.getGroup(id_group);
    }

    @GetMapping(value = "/groups")
    public List<Group> readAll() {
        return groupService.getGroups();
    }

    @DeleteMapping(value = "/groups/{id_group}")
    public void delete(@PathVariable Long id_group) {
        groupService.deleteGroup(id_group);
    }
}