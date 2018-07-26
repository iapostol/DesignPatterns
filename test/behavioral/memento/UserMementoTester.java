package behavioral.memento;

import behavioral.memento.users.User;
import behavioral.memento.users.UserMemory;
import org.junit.Test;

public class UserMementoTester {

    @Test
    public void testUserMemento() {
        User u = new User();
        u.setName("John");
        u.setPhone("0733879348");
        u.setRole("admin");

        UserMemory m = new UserMemory();
        m.setMemento(u.saveMemento());

        u.setName(("Apostol"));
        u.setPhone("+40733879348");
        u.setRole("dev");

        u.restoreMemento(m.getMemento());

    }
}
