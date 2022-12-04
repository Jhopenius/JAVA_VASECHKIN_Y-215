package ru.vsuet.boxes.service;

import ru.vsuet.boxes.domain.Group;
import ru.vsuet.boxes.repository.Repository;

import java.util.List;

public class GroupService implements Service<Group> {

    private final Repository<Group> repository;

    public GroupService(Repository<Group> repository) {
        this.repository = repository;
    }

    @Override
    public Group getById(Long id) {
        return repository.find(id);
    }

    @Override
    public List<Group> getAll() {
        return repository.list();
    }

    @Override
    public void save(Group source) {
        repository.save(source);
    }
}
