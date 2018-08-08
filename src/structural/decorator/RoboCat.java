package structural.decorator;

import structural.decorator.animal.Animal;
import structural.decorator.animal.AnimalDecorator;

public class RoboCat extends AnimalDecorator {
    public RoboCat(Animal cat){super(cat);}

    @Override
    public void eat() {
        System.out.println("RoboCat is preparing food.");
        super.eat();
    }
}
