package creational.builder.auto.vehicles;

public class LandVehicle extends Vehicle {
    private int wheels;

    public LandVehicle(String engine, String model, int wheels) {
        super(engine, model);

        this.wheels = wheels;

    }

    public int getWheels() {
        return wheels;
    }

}
