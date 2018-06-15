package structural.bridge.colorshape.implementor;

public class RedSquare implements Color {

    @Override
    public void drawShape() {
        System.out.println("Draw red square");
    }
}
