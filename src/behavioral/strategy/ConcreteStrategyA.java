package behavioral.strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("Called ConcreteStrategyA.AlgorithmInterface()");
    }
}
