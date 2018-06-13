package creational.abstractfactory;

import creational.abstractfactory.vehicle.FordFactory;
import creational.abstractfactory.vehicle.HondaFactory;
import org.junit.Assert;
import org.junit.Test;

public class VehicleFactoryTest {
    @Test
    public void givenVehicleFactoryCreateHondaBike() {
        HondaFactory hondaFactory = new HondaFactory();
        Assert.assertEquals("HondaBike", hondaFactory.createBike().getClass().getSimpleName());
    }

    @Test
    public void givenVehicleFactoryCreateHondaCar() {
        HondaFactory hondaFactory = new HondaFactory();
        Assert.assertEquals("HondaCar", hondaFactory.createCar().getClass().getSimpleName());
    }


    @Test
    public void givenVehicleFactoryCreateFordBike() {
        FordFactory fordFactory = new FordFactory();
        Assert.assertEquals("FordBike", fordFactory.createBike().getClass().getSimpleName());
    }

    @Test
    public void givenVehicleFactoryCreateFordCar() {
        FordFactory fordFactory = new FordFactory();
        Assert.assertEquals("FordCar", fordFactory.createCar().getClass().getSimpleName());
    }
}
