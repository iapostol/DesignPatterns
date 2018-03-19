package structural.decorator;

import org.junit.Test;
import structural.decorator.car.BasicCar;
import structural.decorator.car.Car;
import structural.decorator.car.LuxuryCar;
import structural.decorator.car.SportsCar;

public class DecoratorTest {

    @Test
    public void name() {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
