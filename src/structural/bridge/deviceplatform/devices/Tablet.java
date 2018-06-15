package structural.bridge.deviceplatform.devices;

import structural.bridge.deviceplatform.devices.Device;
import structural.bridge.deviceplatform.platforms.Platform;
import structural.bridge.deviceplatform.platforms.WindowsPhone;

public class Tablet extends Device {
    public Tablet(Platform platform) {
        super(platform);
    }

    @Override
    public void run() {
        platform.start();
    }
}