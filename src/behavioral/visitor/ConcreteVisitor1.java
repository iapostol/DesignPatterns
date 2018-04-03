package behavioral.visitor;

public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visitorConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(String.format("%s visited by %s", concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void visitorConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(String.format("%s visited by %s", concreteElementB.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
