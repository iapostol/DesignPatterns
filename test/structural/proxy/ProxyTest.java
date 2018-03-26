package structural.proxy;

import org.junit.Assert;
import org.junit.Test;
import structural.proxy.calculator.MathProxy;

public class ProxyTest {

    @Test
    public void test() {

        // Create math proxy
        MathProxy proxy = new MathProxy();

        // Do the math
        Assert.assertEquals(6, proxy.add(4, 2),0);
        Assert.assertEquals(2, proxy.substract(4, 2),0);
        Assert.assertEquals(8, proxy.multiply(4, 2),0);
        Assert.assertEquals(2,proxy.divide(4, 2),0);
    }
}
