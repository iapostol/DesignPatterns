package behavioral.templatemethod;

import behavioral.templatemethod.gof.AbstractClass;
import behavioral.templatemethod.gof.ConcreteClassA;
import behavioral.templatemethod.gof.ConcreteClassB;
import org.junit.Test;

public class GofTemplateMethodTester {
    @Test
    public void test() {
        AbstractClass aA = new ConcreteClassA();
        aA.TemplateMethod();

        AbstractClass aB = new ConcreteClassB();
        aB.TemplateMethod();
    }
}
