package behavioral.templatemethod;

import behavioral.templatemethod.house.GlassHouse;
import behavioral.templatemethod.house.HouseTemplate;
import behavioral.templatemethod.house.WoodenHouse;
import org.junit.Test;

public class HouseTemplateMethodTester {
    @Test
    public void testHouseTemplate() {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
