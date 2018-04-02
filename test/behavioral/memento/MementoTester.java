package behavioral.memento;

import org.junit.Test;

public class MementoTester {

    @Test
    public void test() {
        Originator o = new Originator();
        o.setState("On");

        // Store internal state
        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        // Continue changing originator
        o.setState("Off");

        //Restore saved state

        o.setMemento(c.getMemento());

    }
}
