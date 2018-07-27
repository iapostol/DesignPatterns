package behavioral.state;

import behavioral.state.gof.ConcreteStateA;
import behavioral.state.gof.Context;
import org.junit.Test;

public class GofStateTester {
    @Test
    public void test(){

        // Setup context in a state
        Context c = new Context(new ConcreteStateA());

        // Issue requests, which toggles state

        c.request();
        c.request();
        c.request();
        c.request();
    }
}
