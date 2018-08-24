package structural.adapter;

import org.junit.Test;
import structural.adapter.printer.PrintableList;
import structural.adapter.printer.PrintableListAdapter;

import java.util.ArrayList;

public class PrintableAdapterTest {

    @Test
    public void testPrintAdapter() {

        ArrayList list = new ArrayList();

        list.add("one");
        list.add("two");
        list.add("three");

        PrintableList pl = new PrintableListAdapter();

        pl.printList(list);
    }
}
