package creational.builder.auto.director;

import creational.builder.auto.builders.WaterVehicleBuilder;
import creational.builder.auto.vehicles.Vehicle;

public class WaterVehiclesProductionLine {

    WaterVehicleBuilder builder;

    public WaterVehiclesProductionLine(WaterVehicleBuilder builder) {

        this.builder = builder;
    }

    public Vehicle buildBoat(){
        return builder.setSail("Sail01")
                .setEngine("80hp")
                .setModel("Boat1").build();
    }
}
