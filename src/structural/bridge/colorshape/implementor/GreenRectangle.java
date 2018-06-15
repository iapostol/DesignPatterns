package structural.bridge.colorshape.implementor;

public class GreenRectangle implements Color {

    @Override
    public void drawShape() {
        System.out.println("Draw green rectangle");
    }
}
