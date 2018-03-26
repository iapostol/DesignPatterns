package structural.flyweight;

import org.junit.Test;
import structural.flyweight.gof.Flyweight;
import structural.flyweight.gof.FlyweightFactory;
import structural.flyweight.gof.UnsharedConcreteFlyweight;

public class GofFlyweightTest {


    @Test
    public void test() {

        int extrinsicstate = 22;

        FlyweightFactory factory = new FlyweightFactory();

        // Work with different flyweight instances

        Flyweight fx = factory.getFlyweight("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = factory.getFlyweight("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = factory.getFlyweight("Z");
        fz.operation(--extrinsicstate);

        UnsharedConcreteFlyweight fu = new UnsharedConcreteFlyweight();

        fu.operation(--extrinsicstate);
    }
}
