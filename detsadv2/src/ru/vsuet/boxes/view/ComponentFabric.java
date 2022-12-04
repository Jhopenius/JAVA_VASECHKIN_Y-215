package ru.vsuet.boxes.view;

import ru.vsuet.boxes.domain.Group;
import ru.vsuet.boxes.service.Service;

import java.util.HashMap;
import java.util.Map;

public class ComponentFabric {

    private final Map<ComponentType, Component> components;

    public ComponentFabric() {
        this.components = new HashMap<>();
    }

    public <T> Component build(int type, Service<T> service) {
        try {
            ComponentType componentType = ComponentType.fromType(type);

            return components.computeIfAbsent(componentType, (ct) -> {
                Component component;
                switch (ct) {
                    case MENU:
                        component = new MenuComponent();
                        break;
                    case SINGLE:
                        component = new SingleObjectComponent<>(service);
                        break;
                    case LIST:
                        component = new ObjectsListComponent<>(service);
                        break;
                    case CREATE_GROUP:
                        component = new CreateGroupComponent((Service<Group>) service);
                        break;
                    case UPDATE_GROUP:
                        component = new UpdateBoxComponent((Service<Group>) service);
                        break;
                    default:
                        component = null;
                }
                return component;
            });
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
