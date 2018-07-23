package behavioral.iterator;

import behavioral.iterator.notifications.iterators.Iterator;
import behavioral.iterator.notifications.Notification;
import behavioral.iterator.notifications.collections.NotificationCollection;
import org.junit.Test;

public class NotificationIteratorTest {

    @Test
    public void test() {
        NotificationCollection notifications = new NotificationCollection();

        Iterator iterator = notifications.createIterator();

        while (iterator.hasNext())
        {
            Notification n = (Notification)iterator.next();

            System.out.println(n.getNotification());
        }

    }
}
