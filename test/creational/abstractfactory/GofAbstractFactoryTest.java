package creational.abstractfactory;

import creational.abstractfactory.gof.ConcreteFactory1;
import creational.abstractfactory.gof.ConcreteFactory2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GofAbstractFactoryTest {

    private ConcreteFactory1 concreteFactory1;
    private ConcreteFactory2 concreteFactory2;

    @Before
    public void setUp() throws Exception {
        concreteFactory1 = new ConcreteFactory1();
        concreteFactory2 = new ConcreteFactory2();
    }

    @Test
    public void concreteFactory1CreatesConcreteProductA1()
    {
        Assert.assertEquals("ProductA1", concreteFactory1.createProductA().getClass().getSimpleName());
    }

    @Test
    public void concreteFactory1CreatesConcreteProductB1()
    {
        Assert.assertEquals("ProductB1", concreteFactory1.createProductB().getClass().getSimpleName());
    }

    @Test
    public void concreteFactory2CreatesConcreteProductA2()
    {
        Assert.assertEquals("ProductA2", concreteFactory2.createProductA().getClass().getSimpleName());
    }

    @Test
    public void concreteFactory2CreatesConcreteProductB2()
    {
        Assert.assertEquals("ProductB2", concreteFactory2.createProductB().getClass().getSimpleName());
    }
}
