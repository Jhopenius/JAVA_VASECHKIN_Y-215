package ru.vsuet.kindergarden.repository;

import ru.vsuet.kindergarden.domain.Group;
import ru.vsuet.kindergarden.inmemory.Storage;

import java.util.ArrayList;
import java.util.List;

public class InMemoryGroupRepository implements Repository<Group> {

    private Storage storage;

    public InMemoryGroupRepository() {
        storage = Storage.getInstance();
    }

    @Override
    public Group find(String title) {
        return storage.getGroups().stream()
                .filter(g -> g.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Group source) {
        storage.getGroups().add(source);
    }

    @Override
    public void remove(Group target) {
        storage.getGroups().removeIf(g -> g.getTitle().equalsIgnoreCase(target.getTitle()));
    }

    @Override
    public List<Group> list() {
        return new ArrayList<>(storage.getGroups());
    }
}