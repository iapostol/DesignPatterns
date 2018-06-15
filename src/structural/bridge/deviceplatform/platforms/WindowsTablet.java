package structural.bridge.deviceplatform.platforms;


public class WindowsTablet implements Platform {
    @Override
    public void start() {
        System.out.println("Running Windows on Tablet");
    }
}
