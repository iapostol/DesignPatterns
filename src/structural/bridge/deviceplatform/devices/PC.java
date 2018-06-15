package structural.bridge.deviceplatform.devices;

import structural.bridge.deviceplatform.platforms.Platform;

public class PC extends Device {
    public PC(Platform platform) {
        super(platform);
    }

    @Override
    public void run() {
        platform.start();
    }
}
