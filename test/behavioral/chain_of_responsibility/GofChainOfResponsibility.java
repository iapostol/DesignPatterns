package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.gof.ConcreteHandler1;
import behavioral.chain_of_responsibility.gof.ConcreteHandler2;
import behavioral.chain_of_responsibility.gof.ConcreteHandler3;
import behavioral.chain_of_responsibility.gof.Handler;
import org.junit.Test;

public class GofChainOfResponsibility {

    @Test
    public void test() {

        // Setup Chain of Responsibility
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        // Generate and process request

        int[] requests = { 2, 5, 14, 22, 18, 3, 27, 20 };

        for (int request:requests) {
            h1.handleRequest(request);
        }
    }
}
