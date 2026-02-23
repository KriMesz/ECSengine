package systems;

import engine.EventListener;
import engine.Events;
import engine.Systems;
import engine.World;

import java.util.ArrayList;

public class EventSys implements Systems, EventListener {

    private ArrayList<Events> currentEvents;
    private ArrayList<Events> previousEvents;

    public EventSys() {

        this.currentEvents = new ArrayList<>();
        this.previousEvents = new ArrayList<>();

    }



    // Send events to all systems listening to them.
    public void emit(){

    }

    // For critical "Subframe" events, such as system events, errors and other
    public void criticalEmit(){

    }

    @Override
    public void update(World world) {

    }

    @Override
    public void eventOccurred(Events event) {

    }
}
