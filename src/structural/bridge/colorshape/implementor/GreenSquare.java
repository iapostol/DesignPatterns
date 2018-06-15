package structural.bridge.colorshape.implementor;

public class GreenSquare implements Color {

    @Override
    public void drawShape() {
        System.out.println("Draw green square");
    }
}
