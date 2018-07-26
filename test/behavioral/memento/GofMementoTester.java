package behavioral.memento;

import behavioral.memento.gof.Caretaker;
import behavioral.memento.gof.Originator;
import org.junit.Test;

public class GofMementoTester {

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
