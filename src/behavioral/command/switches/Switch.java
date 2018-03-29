package behavioral.command.switches;

public class Switch {

    Command command;

    public Switch(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
