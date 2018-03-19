package structural.decorator;

import org.junit.Test;
import structural.decorator.gof.ConcreteComponent;
import structural.decorator.gof.ConcreteDecoratorA;
import structural.decorator.gof.ConcreteDecoratorB;

public class GogDecoratorTest {

    @Test
    public void testConcreteDecorator() {

        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();

        decoratorA.setComponent(component);
        decoratorB.setComponent(decoratorA);

        decoratorB.operation();
    }
}
