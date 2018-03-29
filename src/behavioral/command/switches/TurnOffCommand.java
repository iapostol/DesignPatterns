package behavioral.command.switches;

public class TurnOffCommand implements Command {

    private Switchable switchable;

    public TurnOffCommand(Switchable switchable) {
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
