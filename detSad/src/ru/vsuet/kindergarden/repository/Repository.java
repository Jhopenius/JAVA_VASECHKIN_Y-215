package ru.vsuet.kindergarden.repository;

import java.util.List;

public interface Repository<T> {

    T find(String FIO);
    void add(T source);
    void remove(T target);
    List<T> list();
}
