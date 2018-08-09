package creational.abstractfactory.vehicle;


public class HondaFactory implements VehicleFactory {

    @Override
    public Bike createBike() {
        return new SportBike();
    }

    @Override
    public Car createCar() {
        return new SportCar();
    }
}
