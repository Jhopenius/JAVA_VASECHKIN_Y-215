package ru.vsuet.boxes;

import ru.vsuet.boxes.domain.Group;
import ru.vsuet.boxes.repository.DataBaseGroupRepository;
import ru.vsuet.boxes.repository.DataBaseConnector;
import ru.vsuet.boxes.repository.Repository;
import ru.vsuet.boxes.service.GroupService;
import ru.vsuet.boxes.service.Service;
import ru.vsuet.boxes.view.Component;
import ru.vsuet.boxes.view.ComponentFabric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DataBaseConnector connector = new DataBaseConnector();
        Repository<Group> repository = new DataBaseGroupRepository(connector);
        Service<Group> service = new GroupService(repository);
        ComponentFabric fabric = new ComponentFabric();
        System.out.println("----- Enter 0 to see menu ----\n");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int command = scanner.nextInt();
            Component component = fabric.build(command, service);
            if (component == null) {
                return;
            }
            component.draw();
        }

    }
}