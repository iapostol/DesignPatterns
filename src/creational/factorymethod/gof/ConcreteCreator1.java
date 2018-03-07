package creational.factorymethod.gof;

public class ConcreteCreator1 implements Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }

    @Override
    public void operation() {

    }
}