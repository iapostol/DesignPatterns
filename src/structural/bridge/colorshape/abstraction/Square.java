package structural.bridge.colorshape.abstraction;

import structural.bridge.colorshape.implementor.Color;

public class Square extends Shape {

    public Square(Color color){
        super(color);
    }

    @Override
    public void draw() {
        color.drawShape();
    }
}
