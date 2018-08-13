package behavioral.command.drawing;

public class Line implements Shape {
    public void draw() {
        System.out.println("Draw line");
    }

    public void unDraw() {
        System.out.println("UnDraw line");
    }

    public void move() {
        System.out.println("Move line");
    }

    public void unMove() {
        System.out.println("UnMove line");
    }
}
