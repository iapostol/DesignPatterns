package behavioral.template_method;

import org.junit.Test;

public class TemplateMethodTester {
    @Test
    public void test() {
        AbstractClass aA = new ConcreteClassA();
        aA.TemplateMethod();

        AbstractClass aB = new ConcreteClassB();
        aB.TemplateMethod();
    }
}
