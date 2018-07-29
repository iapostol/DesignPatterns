package behavioral.visitor.market.visitables;

import behavioral.visitor.market.visitors.Visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
