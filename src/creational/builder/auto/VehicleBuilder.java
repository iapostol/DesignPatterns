package creational.builder.auto;

public interface VehicleBuilder {
    VehicleBuilder setEngine(String engine);
    VehicleBuilder setModel(String model);
    VehicleBuilder setWheels(int wheels);
    Vehicle Build();
}