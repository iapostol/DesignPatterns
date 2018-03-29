package behavioral.command.gof;

public class Caller {
    private Command command;

    public Caller(Command command) {
        this.command = command;
    }
    public void executeCommand()
    {
        command.execute();
    }
}
