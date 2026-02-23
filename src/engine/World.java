package engine;

import java.util.ArrayList;

public class World {

    private ArrayList<Entity> entities;
    private ArrayList<Components> components;
    private ArrayList<Events> currentEvents;
    private ArrayList<Events> previousEvents;

    public World() {

        this.entities = new ArrayList<>();
        this.components = new ArrayList<>();
        this.currentEvents = new ArrayList<>();
        this.previousEvents = new ArrayList<>();

    }

    public ArrayList<Entity> getEntitiesWithComponent(Class<? extends Components> componentClass) {
        ArrayList<Entity> ret = new ArrayList<>();

        for (Entity e : entities) {
            for (Components c : e.getComponents()) {
                if (componentClass.isInstance(c)) {
                    ret.add(e);
                    break;
                }
            }
        }

        return ret;
    }


    public Entity getEntitiesWithID(int ID) {

        for (Entity e : entities) {
            if (e.getId() == ID) {
                return e;
            }
        }

        return null;

    }


    public void addEntity(Entity e) {
        this.entities.add(e);
    }

    public void addComponent(Components c) {
        this.components.add(c);
    }

    public void addEvent(Events e) {
        this.currentEvents.add(e);
    }

    public ArrayList<Entity> getEntitiesList() {
        return entities;
    }

    public ArrayList<Components> getComponentsList() {
        return components;
    }

    public ArrayList<Events> getCurrentEventsList() {
        return currentEvents;
    }

    public int getFirstAvailableID() {
        int id = 0;
        for (Entity e : this.getEntitiesList()){
            id++;
        }
        return id;
    }

    public ArrayList<Events> getCurrentEvents() {
        return currentEvents;
    }

    public ArrayList<Events> getPreviousEvents() {
        return previousEvents;
    }
}
