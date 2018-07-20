package behavioral.command.switches.commands;

import behavioral.command.switches.receivers.Switchable;

public class TurnOn implements Command {

    private Switchable switchable;

    public TurnOn(Switchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public void execute() {
        switchable.turnOn();
    }

    @Override
    public void undo() {
        switchable.turnOff();
    }
}
