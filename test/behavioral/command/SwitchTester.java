package behavioral.command;

import behavioral.command.switches.commands.Command;
import behavioral.command.switches.commands.TurnOn;
import behavioral.command.switches.invokers.Switch;
import behavioral.command.switches.receivers.Light;
import behavioral.command.switches.receivers.Switchable;
import org.junit.Test;

public class SwitchTester {

    @Test
    public void turnOnThenUndo() {

        //receiver
        Switchable lamp = new Light();

        //command
        Command turnOn = new TurnOn(lamp);

        //invoker (switch) invokes command (turnOn)
        Switch s = new Switch(turnOn);

        s.executeCommand();

        s.undoExecuteCommand();
    }

    @Test
    public void turnOffThenUndo() {

        Switchable lamp = new Light();

        Command turnOn = new TurnOn(lamp);

        Switch s = new Switch(turnOn);

        s.executeCommand();

        s.undoExecuteCommand();
    }
}