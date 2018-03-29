package behavioral.command.notepad;

import java.util.ArrayList;

public class DocumentInvoker {

    private ArrayList<Command> commands;
    private Document doc;

    public DocumentInvoker() {
        commands = new ArrayList<>();
        doc = new Document();
    }

    public void redo(int level){
        System.out.println(String.format("---redo %d level", level));
        commands.get(level).redo();
    }

    public void undo(int level){
        System.out.println(String.format("---undo %d level", level));
        commands.get(level).undo();
    }

    public void write(String text)
    {
        DocumentEditCmd cmd = new DocumentEditCmd(doc,text);
        commands.add(cmd);
    }

    public String read()
    {
        return doc.read();
    }
}
