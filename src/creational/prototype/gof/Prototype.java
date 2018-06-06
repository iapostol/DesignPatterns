package creational.prototype.gof;

public interface Prototype extends Cloneable {

    Prototype clone() throws CloneNotSupportedException;
}
