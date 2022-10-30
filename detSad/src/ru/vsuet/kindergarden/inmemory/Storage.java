package ru.vsuet.kindergarden.inmemory;

import ru.vsuet.kindergarden.domain.Group;
import ru.vsuet.kindergarden.domain.Genders;
import ru.vsuet.kindergarden.domain.Kid;

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

    private List<Group> groups;
    private Storage() {
        groups = new ArrayList<>();
        init();
    }
    public List<Group> getGroups() {
        return groups;
    }
    private void init() {
        Kid kid = new Kid("Vasechkin V.M", Genders.male, "4");
        Kid kid1 = new Kid("Timohina J.S", Genders.female, "5");

        Group group = new Group("Sun", 1);
        group.addKid(kid);
        group.addKid(kid1);

        Kid kid2 = new Kid("Oleinikov S.A", Genders.male, "5");
        Kid kid3 = new Kid("Melnikova I.M.", Genders.female, "6");
        Group group1 = new Group("Moon", 2);
        group1.addKid(kid2);
        group1.addKid(kid3);

        groups.add(group);
        groups.add(group1);
    }
}
