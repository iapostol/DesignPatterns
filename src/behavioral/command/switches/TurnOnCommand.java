package behavioral.command.switches;

public class TurnOnCommand implements Command {

    private Switchable switchable;

    public TurnOnCommand(Switchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public void execute() {
        switchable.turnOn();
    }
}
