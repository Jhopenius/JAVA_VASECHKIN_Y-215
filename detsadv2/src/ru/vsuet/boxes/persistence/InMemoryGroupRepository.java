package ru.vsuet.boxes.persistence;

import ru.vsuet.boxes.domain.Group;
import ru.vsuet.boxes.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryGroupRepository implements Repository<Group> {

    private List<Group> groups;

    public InMemoryGroupRepository() {
        this.groups = Storage.getInstance().groups;
    }

    @Override
    public Group find(Long id) {
        return groups.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Group source) {
        groups.add(source);
    }

    @Override
    public void remove(Group target) {
        groups.removeIf(b -> b.getId().equals(target.getId()));
    }

    @Override
    public List<Group> list() {
        return new ArrayList<>(groups);
    }
}
