package behavioral.strategy;

import org.junit.Test;

public class StrategyTester {
    @Test
    public void test() {
        Context context;

        // Three contexts following different strategies

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
