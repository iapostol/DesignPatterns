package structural.proxy;

import org.junit.Test;
import structural.proxy.gof.Proxy;

public class GofProxyTest {

    @Test
    public void test() {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
