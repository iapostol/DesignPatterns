package behavioral.observer;

public class ConcreteSubject extends Subject {

    String subjectState;

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    public String getSubjectState() {
        return subjectState;
    }
}
