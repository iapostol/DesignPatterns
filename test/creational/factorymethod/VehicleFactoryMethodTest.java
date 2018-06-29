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
    public void createHondaCar() {
        Assert.assertEquals("Car", hondaFactory.create("Car").getClass().getSimpleName());
    }

    @Test
    public void createHondaBike() {
        Assert.assertEquals("Bike", hondaFactory.create("Bike").getClass().getSimpleName());
    }

    @Test
    public void createFerrariCar() {
        Assert.assertEquals("Car", ferrariFactory.create("Car").getClass().getSimpleName());
    }

    @Test
    public void createFerrariBike() {
        Assert.assertEquals("Bike", ferrariFactory.create("Bike").getClass().getSimpleName());
    }
}