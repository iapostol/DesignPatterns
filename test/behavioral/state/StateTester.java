package behavioral.state;

import org.junit.Test;

public class StateTester {
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
