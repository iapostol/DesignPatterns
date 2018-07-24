package behavioral.iterator.notifications.iterators;

public interface Iterator {
    boolean hasNext();
    boolean hasPrevious();
    Object next();
    Object previous();
    Object first();
    Object last();
}
