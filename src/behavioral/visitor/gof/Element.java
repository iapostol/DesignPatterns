package behavioral.visitor.gof;

public interface Element {
    void accept(Visitor visitor);
}
