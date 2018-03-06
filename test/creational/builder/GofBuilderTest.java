package creational.builder;

import creational.builder.gof.ConcreteBuilder1;
import creational.builder.gof.DirectorBuilder;
import org.junit.Assert;
import org.junit.Test;

public class GofBuilderTest {

    @Test
    public void testConcreteBuilder1()
    {
        DirectorBuilder director = new DirectorBuilder(new ConcreteBuilder1());

        director.Construct();

        Assert.assertNotNull(director.getProduct());
    }

}
