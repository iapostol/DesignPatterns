package behavioral.visitor.market.visitables;

import behavioral.visitor.market.visitors.Visitor;

public class Liquor implements Visitable {

    private double price;

    public Liquor(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}
