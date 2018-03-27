package behavioral.command.gof;

public class Invoker {
    private Command command;

    public void executeCommand()
    {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
