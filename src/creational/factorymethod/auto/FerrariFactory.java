package creational.factorymethod.auto;

public class FerrariFactory implements VehicleFactory {
    @Override
    public Vehicle create(String type) {

        switch (type){
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
        }

        return null;
    }
}
