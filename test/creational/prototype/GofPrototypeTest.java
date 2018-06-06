package creational.prototype;

import creational.prototype.gof.ConcretePrototype1;
import creational.prototype.gof.ConcretePrototype2;
import org.junit.Assert;
import org.junit.Test;

public class GofPrototypeTest {

    @Test
    public void testConcretePrototype1() throws CloneNotSupportedException {
        ConcretePrototype1 c = new ConcretePrototype1();

        Assert.assertEquals(c.getName(), ((ConcretePrototype1)c.clone()).getName());
    }

    @Test
    public void testConcretePrototype2() throws CloneNotSupportedException {
        ConcretePrototype2 c = new ConcretePrototype2();

        Assert.assertEquals(c.getName(), ((ConcretePrototype2)c.clone()).getName());
    }
}
