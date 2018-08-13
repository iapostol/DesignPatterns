package behavioral.command;

import behavioral.command.drawing.*;
import org.junit.Test;

public class DrawingCommandTest {

    @Test
    public void testDrawingCommandTest() {

        Shape line = new Line();

        DrawingEditorCommand drawCmd = new DrawCommand(line);

        DrawingController controller = new DrawingController(drawCmd);

        controller.execute();

        controller.unExecute();

        Shape circle = new Circle();

        DrawingEditorCommand moveCommand = new MoveCommand(circle);

        controller = new DrawingController(moveCommand);

        controller.execute();

        controller.unExecute();
    }
}
