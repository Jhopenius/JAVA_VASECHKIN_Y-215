package ru.vsuet.kindergarden;

import ru.vsuet.kindergarden.domain.Kid;
import ru.vsuet.kindergarden.domain.Group;
import ru.vsuet.kindergarden.repository.InMemoryGroupRepository;
import ru.vsuet.kindergarden.repository.InMemoryKidRepository;
import ru.vsuet.kindergarden.repository.Repository;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Repository<Group> groupRepository = new InMemoryGroupRepository();

        System.out.println(groupRepository.list().stream()
                .map(Group::toString)
                .collect(Collectors.joining("\n"))
        );

        Repository<Kid> kidRepository = new InMemoryKidRepository();
        System.out.println(kidRepository.list().stream()
                .map(Kid::toString)
                .collect(Collectors.joining("\n"))
        );
    }
}
