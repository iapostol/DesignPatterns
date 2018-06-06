package creational.prototype.shape;

public class Square implements ShapePrototype {

    @Override
    public ShapePrototype clone() throws CloneNotSupportedException {
        return (Square)super.clone();
    }

    public String getName(){
        return "square";
    }
}
