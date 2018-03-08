package creational.abstractfactory;

import creational.abstractfactory.furniture.Chair;
import creational.abstractfactory.furniture.CofeeTable;
import creational.abstractfactory.furniture.FurnitureFactory;
import creational.abstractfactory.furniture.Sofa;

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
