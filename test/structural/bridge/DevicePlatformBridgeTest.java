package structural.bridge;

import org.junit.Test;
import structural.bridge.deviceplatform.devices.Device;
import structural.bridge.deviceplatform.devices.PC;
import structural.bridge.deviceplatform.devices.Phone;
import structural.bridge.deviceplatform.devices.Tablet;
import structural.bridge.deviceplatform.platforms.WindowsPC;
import structural.bridge.deviceplatform.platforms.WindowsPhone;
import structural.bridge.deviceplatform.platforms.WindowsTablet;

public class DevicePlatformBridgeTest {

    @Test
    public void testRunningWindowsOnPC() {
        Device pc = new PC(new WindowsPC());
        pc.run();
    }

    @Test
    public void testRunningWindowsOnPhone() {
        Device phone = new Phone(new WindowsPhone());
        phone.run();
    }

    @Test
    public void testRunningWindowsOnTablet() {
        Device tablet = new Tablet(new WindowsTablet());
        tablet.run();
    }
}
