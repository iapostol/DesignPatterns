package creational.builder.house;

public class WoodHouse implements House {

    private int walls;
    private int doors;
    private int windows;
    private int roof;

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getRoof() {
        return roof;
    }

    public void setWalls(int i) {
        walls = i;
    }

    public void setDoors(int i) {
        doors = i;
    }

    public void setWindows(int i) {
        windows = i;

    }

    public void setRoof(int i) {
        roof = i;
    }
}
