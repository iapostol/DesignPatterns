package creational.prototype;

import creational.prototype.shape.ShapePrototype;
import creational.prototype.shape.Square;
import org.junit.Assert;
import org.junit.Test;

public class ShapePrototypeTest {

    @Test
    public void testShapePrototype() throws CloneNotSupportedException {

        Square shapePrototype = new Square();

        Assert.assertEquals("square", ((Square)shapePrototype.clone()).getName());
        Assert.assertEquals("square", ((Square)shapePrototype.clone()).getName());
    }
}
