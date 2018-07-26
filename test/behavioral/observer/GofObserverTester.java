package behavioral.observer;

import behavioral.observer.gof.ConcreteObserver;
import behavioral.observer.gof.ConcreteSubject;
import org.junit.Test;

public class GofObserverTester {

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
