package creational.builder.auto;

public class SportCarBuilder implements VehicleBuilder {
    private String engine;
    private String model;
    private int wheels;


    @Override
    public VehicleBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public VehicleBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public VehicleBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public Vehicle Build() {
        return new Vehicle(engine, model, wheels);
    }
}
