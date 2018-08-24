package structural.adapter.printer;

import java.util.ArrayList;

public class PrintableListAdapter implements PrintableList {

    public void printList(ArrayList list) {

        String listString = "";

        for (Object s : list)
        {
            listString += s + "\t";
        }

        PrintString ps = new PrintString();

        ps.print(listString);
    }
}
