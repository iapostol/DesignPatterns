package behavioral.command.switches.invokers;

import behavioral.command.switches.commands.Command;

public class Switch {

    Command command;

    public Switch(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }

    public void undoExecuteCommand(){
        command.undo();
    }
}
