package creational.abstractfactory.vehicle;

public class FordFactory implements VehicleFactory {
    @Override
    public Bike createBike() {
        return new RegularBike();
    }

    @Override
    public Car createCar() {
        return new RegularCar();
    }
}
