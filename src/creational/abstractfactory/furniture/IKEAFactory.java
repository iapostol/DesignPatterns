package creational.abstractfactory.furniture;

public class IKEAFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new IKEAChair();
    }

    @Override
    public Sofa createSofa() {
        return new IKEASofa();
    }

    @Override
    public CofeeTable createCofeeTable() {
        return new IKEACofeeTable();
    }
}
