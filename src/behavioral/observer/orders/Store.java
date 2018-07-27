package behavioral.observer.orders;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {

    List<Observer> observers;

    public Store() {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        System.out.println("---Subscribe---");
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        System.out.println("---Unsubscribe---");
        observers.remove(observer);
    }

    @Override
    public void inform() {
        for (Observer observer : observers)
            observer.update();
    }
}
