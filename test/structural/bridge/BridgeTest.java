package structural.bridge;

import org.junit.Test;
import structural.bridge.colorshape.abstraction.Rectangle;
import structural.bridge.colorshape.abstraction.Shape;
import structural.bridge.colorshape.abstraction.Square;
import structural.bridge.colorshape.implementor.GreenSquare;
import structural.bridge.colorshape.implementor.RedRectangle;
import structural.bridge.colorshape.implementor.RedSquare;

public class BridgeTest {

    @Test
    public void testCreateRedSquare() {

        Shape redSquare = new Square(new RedSquare());

    }

    @Test
    public void testCreateRedRectangle() {

        Shape redRectangle = new Rectangle(new RedRectangle());

    }

    @Test
    public void testCreateGreenSquare() {

        Shape greenSquare = new Square(new GreenSquare());

    }

}
