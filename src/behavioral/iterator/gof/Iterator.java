package behavioral.iterator.gof;

public interface Iterator {
    Object first();
    Object next();
    boolean isDone();
    Object currentItem();
}
