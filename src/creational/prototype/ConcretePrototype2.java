package creational.prototype;

public class ConcretePrototype2 extends Prototype  {

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String getName() {
        return "CP2";
    }
}
