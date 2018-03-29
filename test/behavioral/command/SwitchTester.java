package behavioral.command;

import behavioral.command.switches.*;
import org.junit.Test;

public class SwitchTester {

    @Test
    public void turnOnThenUndo() {

        Switchable lamp = new Light();

        Command turnOn = new TurnOnCommand(lamp);

        Switch s = new Switch(turnOn);

        s.executeCommand();

        s.undoExecuteCommand();
    }

    @Test
    public void turnOffThenUndo() {

        Switchable lamp = new Light();

        Command turnOn = new TurnOnCommand(lamp);

        Switch s = new Switch(turnOn);

        s.executeCommand();

        s.undoExecuteCommand();
    }
}