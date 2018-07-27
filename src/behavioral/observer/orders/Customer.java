package behavioral.observer.orders;

public class Customer implements Observer {

    private Store store;
    private String name;

    public Customer(Store store, String name) {
        this.store = store;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(String.format("%s goes for shopping",name));
    }
}
