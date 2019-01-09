package creational.builder.house;

public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House construct() {

        houseBuilder.buildDoors();
        houseBuilder.buildWalls();
        houseBuilder.buildWindows();
        houseBuilder.buildRoof();

        return houseBuilder.getHouse();
    }
}
