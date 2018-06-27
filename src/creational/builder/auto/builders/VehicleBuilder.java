package creational.builder.auto.builders;

import creational.builder.auto.vehicles.Vehicle;

public interface VehicleBuilder {
    VehicleBuilder setEngine(String engine);
    VehicleBuilder setModel(String model);
    Vehicle build();
}