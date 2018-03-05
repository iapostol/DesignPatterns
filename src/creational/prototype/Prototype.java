package creational.prototype;

public abstract class Prototype implements Cloneable {

    public String getName()
    {
        return "";
    }

    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
