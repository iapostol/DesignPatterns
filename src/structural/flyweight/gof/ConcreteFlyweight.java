package structural.flyweight.gof;

public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("ConcreteFlyweight: " + extrinsicState);
    }
}
