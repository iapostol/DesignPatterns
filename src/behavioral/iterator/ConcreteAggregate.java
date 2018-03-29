package behavioral.iterator;

import java.util.ArrayList;

public class ConcreteAggregate implements Aggregate {

    private ArrayList items = new ArrayList();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getCount() {
        return items.size();
    }

    public Object getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, String value) {
        items.add(position, value);
    }
}
