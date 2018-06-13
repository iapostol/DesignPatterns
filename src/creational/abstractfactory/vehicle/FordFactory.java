package creational.abstractfactory.vehicle;

public class FordFactory implements VehicleFactory {
    @Override
    public Bike createBike() {
        return new FordBike();
    }

    @Override
    public Car createCar() {
        return new FordCar();
    }
}
