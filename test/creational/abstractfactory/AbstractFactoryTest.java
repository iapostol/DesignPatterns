package creational.abstractfactory;

import creational.abstractfactory.furniture.ArtDecoFactory;
import creational.abstractfactory.furniture.IKEAFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractFactoryTest {

    IKEAFactory ikeaFactory;
    ArtDecoFactory artDecoFactory;

    @Before
    public void setUp() throws Exception {
        ikeaFactory = new IKEAFactory();
        artDecoFactory = new ArtDecoFactory();
    }

    @Test
    public void ikeaFactoryCreatesChair() {
        Assert.assertEquals("IKEAChair", ikeaFactory.createChair().getClass().getSimpleName());
    }

    @Test
    public void ikeaFactoryCreatesSofa() {
        Assert.assertEquals("IKEASofa", ikeaFactory.createSofa().getClass().getSimpleName());
    }

    @Test
    public void ikeaFactoryCreatesCofeeTable() {
        Assert.assertEquals("IKEACofeeTable", ikeaFactory.createCofeeTable().getClass().getSimpleName());
    }

    @Test
    public void artDecoFactoryCreatesChair() {
        Assert.assertEquals("ArtDecoChair", artDecoFactory.createChair().getClass().getSimpleName());
    }

    @Test
    public void artDecoFactoryCreatesSofa() {
        Assert.assertEquals("ArtDecoSofa", artDecoFactory.createSofa().getClass().getSimpleName());
    }

    @Test
    public void artDecoFactoryCreatesCofeeTable() {
        Assert.assertEquals("ArtDecoCofeeTable", artDecoFactory.createCofeeTable().getClass().getSimpleName());
    }
}
