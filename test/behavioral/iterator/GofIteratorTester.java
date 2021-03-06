package behavioral.iterator;

import behavioral.iterator.gof.ConcreteAggregate;
import behavioral.iterator.gof.Iterator;
import org.junit.Test;

public class GofIteratorTester {

    @Test
    public void test() {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.setItem(0, "Item A");
        aggregate.setItem(1, "Item B");
        aggregate.setItem(2, "Item C");
        aggregate.setItem(3, "Item D");


        Iterator i = aggregate.createIterator();

        System.out.println("Iterating over collection:");

        Object item = i.first();

        while (item != null)
        {
            System.out.println(item);
            item = i.next();
        }

    }
}
