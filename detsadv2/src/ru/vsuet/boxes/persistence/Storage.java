package ru.vsuet.boxes.persistence;

import ru.vsuet.boxes.domain.Group;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static Storage instance;

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    List<Group> groups;

    private Storage() {
        this.groups = new ArrayList<>();
        init();
    }

    private void init() {
        Group group1 = new Group(1L, "Box 1");
        Group group2 = new Group(2L, "Box 2");

        groups.add(group1);
        groups.add(group2);
    }
}
