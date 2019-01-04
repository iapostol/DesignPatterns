package creational.prototype.shape;

public class Square extends Shape {

    private int radius;

    public Square() {
    }

    public double calculateAria() {
        return Math.PI * radius * radius;
    }

    public Square(Square square) {
        super(square);

        this.radius = square.radius;
    }

    public Shape copy() {
        return new Square(this);
    }


    public void setRadius(int r) {
        radius = r;
    }
}
