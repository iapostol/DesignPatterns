package behavioral.iterator.gof;

public class ConcreteIterator implements Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItem(0);
    }

    @Override
    public Object next() {

        if (current < aggregate.getCount() -1)
            return aggregate.getItem(++current);

        return null;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount();
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }
}
