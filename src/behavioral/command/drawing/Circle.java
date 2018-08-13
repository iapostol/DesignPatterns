package behavioral.command.drawing;

public class Circle implements Shape {
    public void draw() {
        System.out.println("Draw circle");
    }

    public void unDraw() {
        System.out.println("UnDraw circle");
    }

    public void move() {
        System.out.println("Move circle");
    }

    public void unMove() {
        System.out.println("UnMove circle");
    }
}
