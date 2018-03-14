package structural.bridge.colorshape.abstraction;

import structural.bridge.colorshape.implementor.Color;

public abstract class Shape {

    protected Color color;

    protected Shape(Color color){
        this.color = color;
    }

    public abstract void draw();
}
