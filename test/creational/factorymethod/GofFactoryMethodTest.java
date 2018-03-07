package creational.factorymethod;

import creational.factorymethod.gof.ConcreteCreator1;
import creational.factorymethod.gof.Creator;
import org.junit.Assert;
import org.junit.Test;

public class GofFactoryMethodTest {

    @Test
    public void testConcreteCreator1()
    {
        Creator creator = new ConcreteCreator1();

        Assert.assertEquals("ConcreteProduct1", creator.factoryMethod().getClass().getSimpleName());
    }
}
