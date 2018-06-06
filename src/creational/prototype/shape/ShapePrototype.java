package creational.prototype.shape;

public interface ShapePrototype extends Cloneable {
    ShapePrototype clone() throws CloneNotSupportedException;
}
