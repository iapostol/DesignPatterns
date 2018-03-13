package structural.adapter;

import org.junit.Test;
import structural.adapter.gof.Adaptee;
import structural.adapter.gof.Adapter;
import structural.adapter.gof.Target;

public class GofAdapterTest {

    @Test
    public void testAdapter(){

        Target adapter = new Adapter(new Adaptee());

    }
}
