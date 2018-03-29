package behavioral.command;

import behavioral.command.switches.*;
import org.junit.Test;

public class SwitchTester {

    @Test
    public void testTurnOn() {

        Switchable lamp = new Light();

        Command cmd = new TurnOnCommand(lamp);

        Switch s = new Switch(cmd);

        s.executeCommand();
    }
}
