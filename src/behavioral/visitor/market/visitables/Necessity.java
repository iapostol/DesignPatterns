package behavioral.visitor.market.visitables;

import behavioral.visitor.market.visitors.Visitor;

public class Necessity implements Visitable {

    private double price;

    public Necessity(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}