package behavioral.command;

import behavioral.command.notepad.DocumentInvoker;
import org.junit.Test;

public class NotepadCommandTest {

    @Test
    public void test() {

        DocumentInvoker invoker = new DocumentInvoker();

        invoker.write("This is the original text.");

        System.out.println(invoker.read());

        invoker.write(" Here is some other text.");

        invoker.undo(1);

        System.out.println(invoker.read());
    }
}
