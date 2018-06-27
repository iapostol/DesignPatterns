package creational.builder.auto.vehicles;

public abstract class Vehicle {
    private String engine;
    private String model;

    public Vehicle(String engine, String model){
        this.engine = engine;
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }



}
