package behavioral.command.drawing;


public class MoveCommand implements DrawingEditorCommand {
    private Shape shape;

    public MoveCommand(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void execute() {
        System.out.println("Execute command.");
        shape.move();
    }

    @Override
    public void undo() {
        System.out.println("UnExecute command.");
        shape.unMove();
    }
}
