package behavioral.observer.orders;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void inform();
}
