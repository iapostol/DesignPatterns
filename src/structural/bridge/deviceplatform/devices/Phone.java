package structural.bridge.deviceplatform.devices;

import structural.bridge.deviceplatform.platforms.Platform;

public class Phone extends Device {
    public Phone(Platform platform) {
        super(platform);
    }

    @Override
    public void run() {
        platform.start();
    }
}
