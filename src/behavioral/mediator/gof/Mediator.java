package behavioral.mediator.gof;

public interface Mediator {
    void send(String message, Colleague colleague);
}
