package behavioral.iterator.notifications.iterators;

import behavioral.iterator.notifications.Notification;
import behavioral.iterator.notifications.iterators.Iterator;

public class NotificationIterator implements Iterator {

    Notification[] notificationList;

    int pos = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        return pos < notificationList.length - 1 && notificationList[pos] != null;
    }

    @Override
    public boolean hasPrevious() {
        return pos > 0 && notificationList[pos] != null;
    }

    @Override
    public Object next() {
        return notificationList[++pos];
    }

    @Override
    public Object previous() {
        return notificationList[--pos];
    }

    @Override
    public Object first() {
        pos = 0;
        return notificationList[pos];
    }

    @Override
    public Object last() {
        pos = notificationList.length-1;
        return notificationList[pos];
    }
}
