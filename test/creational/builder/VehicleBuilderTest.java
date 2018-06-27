package creational.builder;

import creational.builder.auto.builders.BikeBuilder;
import creational.builder.auto.builders.BoatBuilder;
import creational.builder.auto.builders.CarBuilder;
import creational.builder.auto.director.LandVehiclesProductionLine;
import creational.builder.auto.director.WaterVehiclesProductionLine;
import org.junit.Assert;
import org.junit.Test;

public class VehicleBuilderTest {

    @Test
    public void buildCar()
    {
        LandVehiclesProductionLine prod = new LandVehiclesProductionLine(new CarBuilder());

        Assert.assertEquals("500hp", prod.buildCar().getEngine());
    }

    @Test
    public void buildBike()
    {
        LandVehiclesProductionLine prod = new LandVehiclesProductionLine(new BikeBuilder());

        Assert.assertEquals("80hp", prod.buildBike().getEngine());
    }

    @Test
    public void buildBoat()
    {
        WaterVehiclesProductionLine prod = new WaterVehiclesProductionLine(new BoatBuilder());

        Assert.assertEquals("80hp", prod.buildBoat().getEngine());
    }
}
