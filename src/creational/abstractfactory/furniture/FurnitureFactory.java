package creational.abstractfactory.furniture;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CofeeTable createCofeeTable();
}
