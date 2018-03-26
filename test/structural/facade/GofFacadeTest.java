package structural.facade;

import org.junit.Test;
import structural.facade.gof.Facade;

public class GofFacadeTest {

    @Test
    public void testFacade() {

        Facade facade = new Facade();

        facade.MethodA();
        facade.MethodB();
    }
}
