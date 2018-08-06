package behavioral.observer.clock;

import java.util.ArrayList;
import java.util.List;

public class Clock implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private String time;

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
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