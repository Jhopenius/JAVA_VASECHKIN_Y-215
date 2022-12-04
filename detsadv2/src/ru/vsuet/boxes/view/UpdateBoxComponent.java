package ru.vsuet.boxes.view;


import ru.vsuet.boxes.domain.Group;
import ru.vsuet.boxes.service.Service;

import java.util.Scanner;

public class UpdateBoxComponent extends AbstractComponent<Group> {

    protected UpdateBoxComponent(Service<Group> service) {
        super(ComponentType.UPDATE_GROUP, service);
    }

    @Override
    public void draw() {
        Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter id of box you want to update: ");
        long id = keyboard.nextLong();
        System.out.print("Enter box name: ");
        String name = keyboard.next();
        service.save(new Group(id, name));
        System.out.println("The box has been updated\n");
    }
}
