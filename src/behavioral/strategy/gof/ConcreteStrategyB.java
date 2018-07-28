package behavioral.strategy.gof;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("Called ConcreteStrategyB.AlgorithmInterface()");
    }
}
