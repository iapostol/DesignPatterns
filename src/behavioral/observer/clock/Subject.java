package behavioral.observer.clock;

public interface Subject {
    void register(Observer observer);
    void inform();
}
