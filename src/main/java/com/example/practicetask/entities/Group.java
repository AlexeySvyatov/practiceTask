package com.example.practicetask.entities;

import org.springframework.data.annotation.Id;

public class Group {
    @Id
    public Long id_group;
    private int size;

    public Long getId() {
        return id_group;
    }
    public void setId(Long id_group) {
        this.id_group = id_group;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

}