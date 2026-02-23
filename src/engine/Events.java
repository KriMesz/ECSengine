
package engine;

import java.util.Map;

public class Events {
    private int sourceID;
    private int targetID;
    private EventType eventID;
    private Map<String, Object> data;

    //Simple flags
    public Events(EventType eventID) {
        this.eventID = eventID;
    }

    //Events with a source entity
    public Events(EventType eventID, int sourceID) {
        this.eventID = eventID;
        this.sourceID = sourceID;
    }

    //Events with a source entity with complex data
    public Events(EventType eventID, int sourceID, Map<String, Object> data) {
        this.eventID = eventID;
        this.sourceID = sourceID;
        this.data = data;
    }

    //Events with an entity targeting another
    public Events(EventType eventID, int sourceID, int targetID) {
        this.eventID = eventID;
        this.sourceID = sourceID;
        this.targetID = targetID;
    }

    //Events with an entity targeting another with complex data
    public Events(EventType eventID, int sourceID, int targetID, Map<String, Object> data) {
        this.eventID = eventID;
        this.sourceID = sourceID;
        this.targetID = targetID;
        this.data = data;
    }

    public int getSourceID() {
        return sourceID;
    }

    public int getTargetID() {
        return targetID;
    }

    public Map getData(){
        return data;
    }

    public EventType getEventID() {
        return eventID;
    }

    public void putData(String key, Object value) {
        data.put(key, value);
    }

    // For debugging use
    @Override
    public String toString() {
        String string;
        string = this.eventID + "\t" + this.sourceID + "\t" + this.targetID;
        if (this.data != null) {
            string = string + this.data.toString();
        }

        return string;
    }
}
