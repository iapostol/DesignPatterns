package structural.flyweight.gof;

public class UnsharedConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("UnsharedConcreteFlyweight: " + extrinsicState);
    }
}
