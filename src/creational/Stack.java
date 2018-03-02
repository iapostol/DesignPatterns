package creational;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private static Stack stack;

    private List<Integer> items;

    private Stack()
    {
        items = new ArrayList<>();
    }

    public static Stack getInstance() {

        if (stack == null)
            stack = new Stack();

        return stack;
    }

    public void push(int item) {
        items.add(item);
    }

    public int pop() {
        if (items.size() == 0)
            return 0;

        return items.remove(items.size()-1);
    }

    public int getSize()
    {
        return items.size();
    }
}
