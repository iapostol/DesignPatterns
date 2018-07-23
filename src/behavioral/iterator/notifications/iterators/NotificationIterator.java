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
        if (pos >= notificationList.length ||
                notificationList[pos] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        return notificationList[pos++];
    }

    @Override
    public Object previous() {
        return notificationList[pos--];
    }

    @Override
    public Object first() {
        return notificationList[0];
    }

    @Override
    public Object last() {
        return notificationList[notificationList.length-1];
    }
}
