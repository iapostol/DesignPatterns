package creational.prototype.gof;

public class ConcretePrototype2 implements Prototype  {

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype2)super.clone();
    }

    public String getName() {
        return "CP2";
    }
}
