package StructuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {


    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void render() {

        for (Component component : components)
            component.render();
    }

}
