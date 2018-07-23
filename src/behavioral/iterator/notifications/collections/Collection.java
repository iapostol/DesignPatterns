package behavioral.iterator.notifications.collections;

import behavioral.iterator.notifications.iterators.Iterator;

//aggregate
public interface Collection {
    Iterator createIterator();
}
