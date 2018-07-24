package behavioral.iterator.notifications.collections;

import behavioral.iterator.notifications.Notification;
import behavioral.iterator.notifications.iterators.Iterator;
import behavioral.iterator.notifications.iterators.NotificationIterator;

public class NotificationCollection implements Collection {

    static final int MAX_ITEMS = 6;

    int numberOfItems = 0;

    Notification[] notificationList;

    public NotificationCollection()
    {
        notificationList = new Notification[MAX_ITEMS];

        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
        addItem("Notification 4");
        addItem("Notification 5");
        addItem("Notification 6");
    }

    public void addItem(String str)
    {
        Notification notification = new Notification(str);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Full");
            return;
        }

        notificationList[numberOfItems++] = notification;
    }

    public Iterator createIterator()
    {
        return new NotificationIterator(notificationList);
    }
}
