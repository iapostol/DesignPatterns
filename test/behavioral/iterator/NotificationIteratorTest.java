package behavioral.iterator;

import behavioral.iterator.notifications.iterators.Iterator;
import behavioral.iterator.notifications.Notification;
import behavioral.iterator.notifications.collections.NotificationCollection;
import org.junit.Test;

public class NotificationIteratorTest {

    @Test
    public void testNext() {

        System.out.println("---Test Next---");

        NotificationCollection notifications = new NotificationCollection();

        Iterator iterator = notifications.createIterator();

        Notification n = (Notification) iterator.first();

        System.out.println(n.getNotification());

        while (iterator.hasNext())
        {
            n = (Notification)iterator.next();

            System.out.println(n.getNotification());
        }
    }

    @Test
    public void testPrevious() {

        System.out.println("---Test Previous---");

        NotificationCollection notifications = new NotificationCollection();

        Iterator iterator = notifications.createIterator();

        Notification n = (Notification) iterator.last();

        System.out.println(n.getNotification());

        while (iterator.hasPrevious())
        {
            n = (Notification)iterator.previous();

            System.out.println(n.getNotification());
        }
    }
}
