package creational.builder.auto.director;

import creational.builder.auto.builders.LandVehicleBuilder;
import creational.builder.auto.vehicles.Vehicle;

public class LandVehiclesProductionLine {

    LandVehicleBuilder builder;

    public LandVehiclesProductionLine(LandVehicleBuilder builder) {

        this.builder = builder;
    }

    public Vehicle buildCar() {
        return builder.setWheels(4)
                .setEngine("500hp")
                .setModel("Ferrari")
                .build();
    }

    public Vehicle buildBike() {
        return builder.setWheels(2)
                .setEngine("80hp")
                .setModel("Yamaha")
                .build();
    }
}
