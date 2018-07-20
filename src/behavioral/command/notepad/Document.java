package behavioral.command.notepad;

import java.util.ArrayList;

//receivers
public class Document {

    private ArrayList<String> textArray = new ArrayList<String>();

    public void write(String text) {
        textArray.add(text);
    }

    public void delete(String text) {
        textArray.remove(text);
    }

    public void delete(int level) {
        textArray.remove(level);
    }

    public String read(){
        StringBuilder sb = new StringBuilder();
        for (String text: textArray) {
            sb.append(text);
        }

        return sb.toString();
    }
}
