package ru.vsuet.kindergarden.repository;

import  ru.vsuet.kindergarden.domain.Kid;
import ru.vsuet.kindergarden.inmemory.Storage;

import java.util.List;
import java.util.stream.Collectors;


public class InMemoryKidRepository implements Repository<Kid> {
    private List<Kid> kids;
    public InMemoryKidRepository() {
        kids = Storage.getInstance().getGroups().stream()
                .flatMap(g -> g.getKids().stream())
                .collect(Collectors.toList());
    }

    @Override
    public Kid find(String FIO) {
        return kids.stream()
                .filter(k -> k.getFIO().equalsIgnoreCase(FIO))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Kid source) {
        throw new IllegalStateException("Method is not suppported");
    }

    @Override
    public void remove(Kid target) {
        throw new IllegalStateException("Method is not suppported");
    }

    @Override
    public List<Kid> list() {
        return kids;
    }
}
