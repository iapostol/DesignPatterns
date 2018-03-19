package structural.decorator.gof;

public class ConcreteDecoratorA extends Decorator {

    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorA.operation()");
    }
}
