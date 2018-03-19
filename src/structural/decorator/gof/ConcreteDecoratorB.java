package structural.decorator.gof;

public class ConcreteDecoratorB extends Decorator {

    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("ConcreteDecoratorB.operation()");
    }

    private void addBehavior(){
        System.out.println("ConcreteDecoratorB.addBehavior()");
    }
}
