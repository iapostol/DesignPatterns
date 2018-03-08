package creational.abstractfactory.furniture;

public class ArtDecoFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CofeeTable createCofeeTable() {
        return new ArtDecoCofeeTable();
    }
}
