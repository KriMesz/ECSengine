package systems;

import engine.*;


public class ManagerSys implements Systems, EventListener {


    private Manager manager;

    public ManagerSys(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void update(World world) {


        //Get rid of this and move it fully to eventOccurred
        for (Events e : world.getCurrentEventsList()){
            if(e.getEventID() == EventType.STOP){
                this.manager.stop();
            }
            if(e.getEventID() == EventType.ERROR){
                this.manager.errorStop(e.toString());
            }
        }

    }

    @Override
    public void eventOccurred(Events event) {
        if(event.getEventID() == EventType.STOP){
            this.manager.stop();
        }
        if(event.getEventID() == EventType.ERROR){
            this.manager.errorStop(event.toString());
        }
    }
}
