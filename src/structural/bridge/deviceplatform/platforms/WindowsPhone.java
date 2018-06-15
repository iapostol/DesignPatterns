package structural.bridge.deviceplatform.platforms;

public class WindowsPhone implements Platform {
    @Override
    public void start() {
        System.out.println("Running Windows on Phone");
    }
}
