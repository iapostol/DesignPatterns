package behavioral.template_method;

public class ConcreteClassA extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("ConcreteClassA.PrimitiveOperation1()");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("ConcreteClassA.PrimitiveOperation2()");
    }
}
