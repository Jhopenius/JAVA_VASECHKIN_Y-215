package ru.vsuet.boxes.domain;

public class Kid {
    private Long id;
    private String name;
    private Genders gender;

    public Kid(Long id, String name, Genders gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
