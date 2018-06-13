package creational.abstractfactory.vehicle;


public class HondaFactory implements VehicleFactory {

    @Override
    public Bike createBike() {
        return new HondaBike();
    }

    @Override
    public Car createCar() {
        return new HondaCar();
    }
}
