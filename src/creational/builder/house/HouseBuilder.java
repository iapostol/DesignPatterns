package creational.builder.house;

public interface HouseBuilder {
    void buildWalls();
    void buildDoors();
    void buildWindows();
    void buildRoof();
    House getHouse();
}
