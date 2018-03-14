package structural.bridge;

import org.junit.Test;
import structural.bridge.gof.Abstraction;
import structural.bridge.gof.ConcreteImplementorA;
import structural.bridge.gof.RefinedAbstraction;

public class GofBridgeTest {

    @Test
    public void testConcreteImplementorA() {

        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());

        abstraction.operation();
    }
}
