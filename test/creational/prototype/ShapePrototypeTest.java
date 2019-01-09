package creational.prototype;

import creational.prototype.shape.Rectangle;
import creational.prototype.shape.Shape;
import creational.prototype.shape.Square;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapePrototypeTest {

    @Test
    public void testShapePrototype() {

        List<Shape> shapes = new ArrayList<>();

        Rectangle r = new Rectangle();

        r.setWidth(2);
        r.setHeight(3);

        shapes.add(r.copy());
        shapes.add(r.copy());
        shapes.add(r.copy());
        shapes.add(r.copy());
        shapes.add(r.copy());

        double totalShapeArea = 0;

        for (Shape shape:shapes) {
            totalShapeArea+= shape.calculateAria();
        }

        Assert.assertEquals(30,totalShapeArea, 0.001);
    }
}
