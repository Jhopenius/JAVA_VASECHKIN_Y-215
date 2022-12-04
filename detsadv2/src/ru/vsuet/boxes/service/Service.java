package ru.vsuet.boxes.service;

import java.util.List;

public interface Service<T> {

    T getById(Long id);

    List<T> getAll();

    void save(T source);
}
