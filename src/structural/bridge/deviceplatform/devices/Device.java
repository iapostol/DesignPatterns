package structural.bridge.deviceplatform.devices;

import structural.bridge.deviceplatform.platforms.Platform;

public abstract class Device {

    public Platform platform;

    public Device(Platform platform){
        this.platform = platform;
    }

    public abstract void run();

}
