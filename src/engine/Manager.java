package engine;

import systems.EventSys;
import systems.ManagerSys;

import java.util.ArrayList;

public class Manager {

    private ArrayList<Systems> sysList;
    private boolean isRunning = true;
    private World world;
    private ManagerSys managerSys;
    private EventSys eventSys;

    public Manager(){

        // Creating world, systems and components for proper functionality
        this.sysList = new ArrayList<>();
        this.world = new World();

        // Special systems with access to manager
        this.managerSys = new ManagerSys(this);

        // Other important systems
        this.eventSys = new EventSys();
        // this.loader = new LoaderSys(); <-- please add ;-;

        // Ent ID:0  -  engine entity with global values
        this.world.addEntity(new Entity(0));

    }

    //Updates every system then reads events meant for the manager after everything has been updated and clears events / flags
    public void run(){
        while (this.isRunning){

            this.eventSys.emit();
            this.eventSys.update(this.world);

            for (Systems s : this.sysList){
                s.update(this.world);
            }

            this.managerSys.update(this.world);
            world.getCurrentEventsList().clear(); // get rid of this, there is an event system

        }
    }

    public void addSystem(Systems s){
        this.sysList.add(s);
    }

    public void stop(){

        this.isRunning = false;
    }

    public void output(String string){
        System.out.println(string);
    }

    public void errorStop(String string){

        this.output(string);
        this.stop();

    }

    public World getWorld(){
        return this.world;
    }

    public ArrayList<Systems> getSystemsList(){
        return this.sysList;
    }

}
