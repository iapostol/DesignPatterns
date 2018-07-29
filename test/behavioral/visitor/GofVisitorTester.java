package behavioral.visitor;

import behavioral.visitor.gof.*;
import org.junit.Test;

public class GofVisitorTester {
    @Test
    public void test() {
        // Setup structure

        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        // Create visitor objects

        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        ConcreteVisitor2 v2 = new ConcreteVisitor2();

        // Structure accepting visitors

        o.accept(v1);
        o.accept(v2);
    }
}
