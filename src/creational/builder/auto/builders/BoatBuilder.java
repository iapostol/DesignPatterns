package creational.builder.auto.builders;

import creational.builder.auto.vehicles.Boat;
import creational.builder.auto.vehicles.Vehicle;

public class BoatBuilder implements WaterVehicleBuilder {

    private String engine;
    private String model;
    private String sail;

    @Override
    public WaterVehicleBuilder setSail(String sail) {
        this.sail = sail;
        return this;
    }

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
    public Vehicle build() {
        return new Boat(engine,model,sail);
    }
}
