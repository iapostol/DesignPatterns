package creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTest {
    @Test
    public void testTwoInstances() {
        Logger logger1 = Logger.create();
        logger1.log("test");
        Assert.assertEquals("test", logger1.getText());

        Logger logger2 = Logger.create();
        logger2.log("test");
        Assert.assertEquals("testtest", logger2.getText());
    }
}
