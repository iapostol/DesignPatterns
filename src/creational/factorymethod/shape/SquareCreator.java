package creational.factorymethod.shape;

public class SquareCreator implements ShapeCreator {
    public Shape create() {
        return new Square();
    }
}
