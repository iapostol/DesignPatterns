package structural.bridge.deviceplatform.platforms;

public class WindowsPC implements Platform {

    @Override
    public void start() {
        System.out.println("Running Windows on PC");
    }
}
