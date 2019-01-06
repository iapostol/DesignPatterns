package creational.factorymethod;

import creational.factorymethod.shape.RectangleCreator;
import creational.factorymethod.shape.Shape;
import creational.factorymethod.shape.ShapeCreator;
import creational.factorymethod.shape.SquareCreator;
import org.junit.Test;

public class ShapeFactoryMethodTest {

    @Test
    public void testSquareCreator() {

        ShapeCreator creator = new SquareCreator();

        Shape square = creator.create();
    }

    @Test
    public void testRectangleCreator() {

        ShapeCreator creator = new RectangleCreator();

        Shape rectangle = creator.create();
    }
}
