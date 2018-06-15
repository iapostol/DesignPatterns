package structural.bridge.colorshape.implementor;

public class RedRectangle implements Color {

    @Override
    public void drawShape() {
        System.out.println("Draw red rectangle");
    }
}
