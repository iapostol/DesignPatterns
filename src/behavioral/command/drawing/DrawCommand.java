package behavioral.command.drawing;

public class DrawCommand implements DrawingEditorCommand {

    private Shape shape;

    public DrawCommand(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void execute() {
        System.out.println("Execute command.");
        shape.draw();
    }

    @Override
    public void undo() {
        System.out.println("UneExecute command.");
        shape.unDraw();
    }
}
