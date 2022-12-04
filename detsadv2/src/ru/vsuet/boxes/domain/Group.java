package ru.vsuet.boxes.domain;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private Long id;
    private String name;

    private List<Kid> kids;

    public Group(Long id, String name) {
        this.id = id;
        this.name = name;
        this.kids = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Kid> getKids() {
        return kids;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kids=" + kids +
                '}';
    }
}
