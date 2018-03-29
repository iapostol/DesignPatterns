package behavioral.command.switches;

import behavioral.command.switches.Switchable;

public class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Turn on");
    }

    @Override
    public void turnOf() {
        System.out.println("Turn off");
    }
}
