package ru.vsuet.boxes.view;

import java.util.Arrays;

public enum ComponentType {
    MENU(0, " - menu"),
    LIST(1, " - objects list"),
    SINGLE(2, " - get object by id"),
    CREATE_GROUP(3, " - create new object"),
    UPDATE_GROUP(4, " - update object");

    private final int type;
    private final String comment;

    ComponentType(int type, String comment) {
        this.type = type;
        this.comment = comment;
    }

    public int getType() {
        return type;
    }

    public String getComment() {
        return comment;
    }

    public static ComponentType fromType(int type) {
        return Arrays.stream(values())
                .filter(v -> v.type == type)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No component with type: " + type));
    }
}
