package behavioral.command;

import behavioral.command.gof.Caller;
import behavioral.command.gof.Command;
import behavioral.command.gof.ConcreteCommand;
import behavioral.command.gof.Receiver;
import org.junit.Test;

public class GofCommandTest {
    @Test
    public void test() {

        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Caller caller = new Caller(command);

        caller.executeCommand();
    }
}
