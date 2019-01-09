package creational.prototype.shape;

import creational.prototype.shape.Shape;

public class Rectangle extends Shape {

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int width;
    private int height;


    public Rectangle() {
    }

    public double calculateAria() {
        return width * height;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Shape copy(){
        return new Rectangle(this);
    }
}
