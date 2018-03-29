package behavioral.command.notepad;

public class DocumentEditCmd implements Command {

    private Document doc;
    private String text;

    public DocumentEditCmd(Document doc, String text) {
        this.doc = doc;
        this.text = text;
        doc.write(text);
    }

    @Override
    public void redo() {
        doc.write(text);
    }

    @Override
    public void undo() {
        doc.delete(text);
    }
}