package behavioral.command.switches;

public class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Turn on light");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off light");
    }
}
