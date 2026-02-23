

package engine;

import java.util.ArrayList;

public class Entity {
    private ArrayList<Components> components;
    private int id;

    public Entity(int id) {
        this.id = id;
        components = new ArrayList<>();
    }

    public void addComponent(Components component) {
        components.add(component);
    }

    public int getId() {
        return id;
    }

    public ArrayList<Components> getComponents() {
        return components;
    }

}
