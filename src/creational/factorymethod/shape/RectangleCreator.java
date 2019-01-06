package creational.factorymethod.shape;

public class RectangleCreator implements ShapeCreator {
    public Shape create() {
        return new Rectangle();
    }
}
