package structural.bridge.colorshape.abstraction;

import structural.bridge.colorshape.implementor.Color;

public class Rectangle extends Shape {

    public Rectangle(Color color){
        super(color);
        this.color = color;
    }

    @Override
    public void draw() {
        color.drawShape();
    }
}
