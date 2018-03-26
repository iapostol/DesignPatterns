package structural.flyweight;

import org.junit.Test;
import structural.flyweight.platforms.Code;
import structural.flyweight.platforms.Platform;
import structural.flyweight.platforms.PlatformFactory;

public class FlyweightTest {
    @Test
    public void test() {

        Code code = new Code();
        code.setCode("C Code...");
        Platform platform = PlatformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println("-------------------------------------");
        code = new Code();
        code.setCode("C Code2...");
        platform = PlatformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println("-------------------------------------");
        code = new Code();
        code.setCode("JAVA Code...");
        platform = PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println("-------------------------------------");
        code = new Code();
        code.setCode("JAVA Code2...");
        platform = PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println("-------------------------------------");
        code = new Code();
        code.setCode("RUBY Code...");
        platform = PlatformFactory.getPlatformInstance("RUBY");
        platform.execute(code);
        System.out.println("-------------------------------------");
        code = new Code();
        code.setCode("RUBY Code2...");
        platform = PlatformFactory.getPlatformInstance("RUBY");
        platform.execute(code);

    }
}
