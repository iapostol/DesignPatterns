package behavioral.strategy;

import behavioral.strategy.gof.ConcreteStrategyA;
import behavioral.strategy.gof.ConcreteStrategyB;
import behavioral.strategy.gof.ConcreteStrategyC;
import behavioral.strategy.gof.Context;
import org.junit.Test;

public class GofStrategyTester {
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
