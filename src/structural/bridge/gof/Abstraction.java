package structural.bridge.gof;

public abstract class Abstraction {

    protected Implementor implementor;

    protected Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public abstract void operation();
}
