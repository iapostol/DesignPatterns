package behavioral.mediator;

public class ConcreteMediator1 implements Mediator {

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    public ConcreteColleague1 colleague1;
    public ConcreteColleague2 colleague2;

    @Override
    public void send(String message, Colleague colleague) {

        if (colleague1 == colleague){
            colleague1.notify(message);
            return;
        }

        if (colleague2 == colleague){
            colleague2.notify(message);
            return;
        }

    }
}
