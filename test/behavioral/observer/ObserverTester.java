package behavioral.observer;

import org.junit.Test;

public class ObserverTester {

    @Test
    public void test() {

        // Configure Observer pattern

        ConcreteSubject s = new ConcreteSubject();

        s.attach(new ConcreteObserver(s, "X"));
        s.attach(new ConcreteObserver(s, "Y"));
        s.attach(new ConcreteObserver(s, "Z"));

        // Change subject and notify observers

        s.setSubjectState("ABC");
        s.inform();
    }
}
