package behavioral.observer;

import behavioral.observer.clock.Clock;
import behavioral.observer.clock.RealTimeDisplay;
import org.junit.Test;

public class ClockObserverTester {
    @Test
    public void testClockObserver() {

        Clock clock = new Clock();

        RealTimeDisplay phoneDisplay = new RealTimeDisplay(clock);
        phoneDisplay.setName("PhoneDisplay");

        RealTimeDisplay wallDisplay = new RealTimeDisplay(clock);
        wallDisplay.setName("WallDisplay");

        clock.register(phoneDisplay);
        clock.register(wallDisplay);

        clock.setTime("12:00");

        clock.inform();
    }
}
