package creational.builder;

import creational.builder.house.Director;
import creational.builder.house.House;
import creational.builder.house.WoodHouseBuilder;
import org.junit.Assert;
import org.junit.Test;

public class HouseBuilderTest {
    @Test
    public void testHouseBuilder() {
        Director d = new Director(new WoodHouseBuilder());
        House h = d.construct();
        Assert.assertEquals(2,h.getDoors());
    }
}
