package creational.builder.auto;

public class ProductionLine {

    VehicleBuilder builder;

    public ProductionLine(VehicleBuilder builder) {
        this.builder = builder;
    }

    public Vehicle BuildRegularCar() {

        return builder.setEngine("140hp")
                .setModel("BMW")
                .setWheels(4).Build();
    }

    public Vehicle BuildSportCar() {

        return builder.setEngine("500hp")
                .setModel("Ferrari")
                .setWheels(4).Build();
    }

    public Vehicle BuildBike() {
        return builder.setEngine("80hp")
                .setModel("Yamaha")
                .setWheels(2).Build();
    }
}
