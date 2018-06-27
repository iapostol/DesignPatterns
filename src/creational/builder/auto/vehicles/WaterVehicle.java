package creational.builder.auto.vehicles;

public class WaterVehicle extends Vehicle {

    private String sail;

    public WaterVehicle(String engine, String model, String sail) {
        super(engine, model);

        this.sail = sail;
    }

    public String getSail() {
        return sail;
    }
}
