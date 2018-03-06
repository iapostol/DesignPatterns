package creational.builder;

import creational.builder.auto.BikeBuilder;
import creational.builder.auto.SportCarBuilder;
import creational.builder.auto.RegularCarBuilder;
import creational.builder.auto.ProductionLine;
import org.junit.Assert;
import org.junit.Test;

public class VehicleBuilderTest {

    @Test
    public void buildRegularCar()
    {
        ProductionLine prod = new ProductionLine(new RegularCarBuilder());

        Assert.assertEquals("140hp", prod.BuildRegularCar().getEngine());
    }

    @Test
    public void buildSportCar()
    {
        ProductionLine prod = new ProductionLine(new SportCarBuilder());

        Assert.assertEquals("500hp", prod.BuildSportCar().getEngine());
    }

    @Test
    public void buildBike()
    {
        ProductionLine prod = new ProductionLine(new BikeBuilder());

        Assert.assertEquals("80hp", prod.BuildBike().getEngine());
    }
}
