package behavioral.observer;

public class ConcreteObserver implements Observer {
    private String name;
    private String observerState;

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    private ConcreteSubject subject;

    // Constructor

    public ConcreteObserver(
            ConcreteSubject subject, String name)
    {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update()
    {
        observerState = subject.getSubjectState();
        System.out.println(String.format("Observer %s new state is %s", name, observerState));
    }


}
