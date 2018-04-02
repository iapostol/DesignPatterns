package behavioral.mediator;

import org.junit.Test;

public class MediatorTester {

    @Test
    public void test() {
        ConcreteMediator1 mediator1 = new ConcreteMediator1();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator1);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator1);

        mediator1.setColleague1(colleague1);
        mediator1.setColleague2(colleague2);

        colleague1.send("How are you ?");
        colleague2.send("Fine, thanks.");
    }
}
