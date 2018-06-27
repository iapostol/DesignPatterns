package creational.builder.auto.builders;

import creational.builder.auto.builders.VehicleBuilder;
import creational.builder.auto.vehicles.Bike;
import creational.builder.auto.vehicles.Vehicle;

public class BikeBuilder implements LandVehicleBuilder {
    private String engine;
    private String model;
    private int wheels;

    @Override
    public LandVehicleBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public LandVehicleBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public LandVehicleBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public Vehicle build() {
        return new Bike(engine, model, wheels);
    }
}
