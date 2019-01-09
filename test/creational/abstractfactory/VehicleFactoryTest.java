package creational.abstractfactory;

import creational.abstractfactory.vehicle.FordFactory;
import creational.abstractfactory.vehicle.HondaFactory;
import org.junit.Assert;
import org.junit.Test;

public class VehicleFactoryTest {
    @Test
    public void givenVehicleFactoryCreateHondaBike() {
        HondaFactory hondaFactory = new HondaFactory();
        Assert.assertEquals("SportBike", hondaFactory.createBike().getName());
    }

    @Test
    public void givenVehicleFactoryCreateHondaCar() {
        HondaFactory hondaFactory = new HondaFactory();
        Assert.assertEquals("SportCar", hondaFactory.createCar().getName());
    }


    @Test
    public void givenVehicleFactoryCreateFordBike() {
        FordFactory fordFactory = new FordFactory();
        Assert.assertEquals("RegularBike", fordFactory.createBike().getName());
    }

    @Test
    public void givenVehicleFactoryCreateFordCar() {
        FordFactory fordFactory = new FordFactory();
        Assert.assertEquals("RegularCar", fordFactory.createCar().getName());
    }
}
