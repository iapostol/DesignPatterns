package behavioral.command.drawing;

public class DrawingController {
    DrawingEditorCommand command;
    DrawingEditorCommand undoCommand;


    public DrawingController(DrawingEditorCommand command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
        undoCommand = command;
    }

    public void unExecute() {
        undoCommand.undo();
    }
}