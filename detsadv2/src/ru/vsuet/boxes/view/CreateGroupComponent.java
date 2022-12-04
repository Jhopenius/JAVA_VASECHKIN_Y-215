package ru.vsuet.boxes.view;


import ru.vsuet.boxes.domain.Group;
import ru.vsuet.boxes.service.Service;

import java.util.Scanner;

public class CreateGroupComponent extends AbstractComponent<Group> {

    protected CreateGroupComponent(Service<Group> service) {
        super(ComponentType.CREATE_GROUP, service);
    }

    @Override
    public void draw() {
        Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter box name: ");
        String name = keyboard.next();
        service.save(new Group(null, name));
        System.out.println("New group has been created\n");
    }
}
