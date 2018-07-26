package behavioral.observer.clock;

public class RealTimeDisplay implements Observer {

    private Clock clock;

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public RealTimeDisplay(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void update() {
        System.out.println(String.format("The time displayed on %s is %s", name, clock.getTime()));
    }
}
