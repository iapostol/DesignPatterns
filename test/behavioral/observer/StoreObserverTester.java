package behavioral.observer;

import behavioral.observer.orders.Customer;
import behavioral.observer.orders.Store;
import org.junit.Test;

public class StoreObserverTester {

    @Test
    public void testStore() {
        Store store = new Store();

        Customer john = new Customer(store, "John");
        Customer bob = new Customer(store, "Bob");
        Customer jack = new Customer(store, "Jack");

        store.subscribe(john);
        store.subscribe(bob);
        store.subscribe(jack);

        store.inform();

        store.unsubscribe(john);

        store.inform();
    }
}
