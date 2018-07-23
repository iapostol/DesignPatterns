package behavioral.command.switches.commands;

import behavioral.command.switches.receivers.Switchable;

//concrete command
public class TurnOff implements Command {

    private Switchable switchable;

    public TurnOff(Switchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public void execute() {
        switchable.turnOff();
    }

    @Override
    public void undo() {
        switchable.turnOn();
    }
}
