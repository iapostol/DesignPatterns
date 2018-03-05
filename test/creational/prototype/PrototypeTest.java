package creational.prototype;

import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void testConcretePrototype1() throws CloneNotSupportedException {
        ConcretePrototype1 c = new ConcretePrototype1();

        Assert.assertEquals(c.getName(), c.clone().getName());
    }

    @Test
    public void testConcretePrototype2() throws CloneNotSupportedException {
        ConcretePrototype2 c = new ConcretePrototype2();

        Assert.assertEquals(c.getName(), c.clone().getName());
    }
}
