package creational.prototype.gof;

public class ConcretePrototype1 implements Prototype {

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype1)super.clone();
    }

    public String getName() {
        return "CP1";
    }
}
