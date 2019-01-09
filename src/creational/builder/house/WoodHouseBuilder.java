package creational.builder.house;

public class WoodHouseBuilder implements HouseBuilder {

    WoodHouse house;

    public WoodHouseBuilder() {
        house = new WoodHouse();
    }

    public void buildWalls() {
        house.setWalls(4);
    }

    public void buildDoors() {
        house.setDoors(2);
    }

    public void buildWindows() {
        house.setWindows(4);
    }

    public void buildRoof() {
        house.setRoof(1);
    }

    public House getHouse() {
        return house;
    }
}
