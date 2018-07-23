package behavioral.iterator.notifications.iterators;

public interface Iterator {
    boolean hasNext();
    Object next();
    Object previous();
    Object first();
    Object last();
}
