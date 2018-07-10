package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.approver.*;
import org.junit.Test;

public class ApproverChainOfResponsibilittTest {

    @Test
    public void test() {

        // Setup Chain of Responsibility
        Approver larry = new Director();
        Approver sam = new VicePresident();
        Approver tammy = new President();

        larry.setSuccessor(sam);
        sam.setSuccessor(tammy);

        // Generate and process purchase requests
        Purchase p = new Purchase(2034, 350.00, "Assets");
        larry.processRequest(p);

        p = new Purchase(2035, 32590.10, "Project X");
        larry.processRequest(p);

        p = new Purchase(2036, 122100.00, "Project Y");
        larry.processRequest(p);

    }
}
