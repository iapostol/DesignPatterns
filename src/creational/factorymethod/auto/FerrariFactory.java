package creational.factorymethod.auto;

public class FerrariFactory implements VehicleFactory {
    @Override
    public Vehicle create(String type) {

        switch (type){
            case "Regular":
                return new RegularCar();
            case "Sport":
                return new SportCar();
        }

        return null;
    }
}
