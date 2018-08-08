package structural.decorator;

import org.junit.Test;
import structural.decorator.animal.Animal;
import structural.decorator.animal.Cat;
import structural.decorator.animal.Dog;

public class AnimalDecoratorTest {
    @Test
    public void testAnimalDecorator() {
        Animal animal = new Dog();
        animal.eat();

        Animal cat = new Cat();
        cat.eat();

        Animal roboCat = new RoboCat(cat);
        roboCat.eat();
    }
}
