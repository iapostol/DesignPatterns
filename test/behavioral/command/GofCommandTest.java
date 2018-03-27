package behavioral.command;

import behavioral.command.gof.Command;
import behavioral.command.gof.ConcreteCommand;
import behavioral.command.gof.Receiver;
import org.junit.Test;

public class GofCommandTest {
    @Test
    public void test() {
        // Create receiver, command, and invoker

        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        behavioral.command.gof.Invoker invoker = new behavioral.command.gof.Invoker();

        // Set and execute command

        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
