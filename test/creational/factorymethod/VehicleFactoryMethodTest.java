package creational.factorymethod;

import creational.factorymethod.auto.FerrariFactory;
import creational.factorymethod.auto.HondaFactory;
import creational.factorymethod.auto.VehicleFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VehicleFactoryMethodTest {

    VehicleFactory hondaFactory;
    VehicleFactory ferrariFactory;


    @Before
    public void setUp() {
        hondaFactory = new HondaFactory();
        ferrariFactory = new FerrariFactory();
    }

    @Test
    public void createHondaRegularCar() {
        Assert.assertEquals("RegularCar", hondaFactory.create("Regular").getClass().getSimpleName());
    }

    @Test
    public void createHondaSportCar() {
        Assert.assertEquals("SportCar", hondaFactory.create("Sport").getClass().getSimpleName());
    }

    @Test
    public void createFerrariRegularCar() {
        Assert.assertEquals("RegularCar", ferrariFactory.create("Regular").getClass().getSimpleName());
    }

    @Test
    public void createFerrariSportCar() {
        Assert.assertEquals("SportCar", ferrariFactory.create("Sport").getClass().getSimpleName());
    }
}