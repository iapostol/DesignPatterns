package behavioral.observer.clock;

import java.util.ArrayList;
import java.util.List;

public class Clock implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private String time;

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void inform() {
        for(Observer o : observers)
            o.update();
    }

    public void setTime(String time){
        this.time = time;
    }

    public String getTime(){
        return time;
    }
}
