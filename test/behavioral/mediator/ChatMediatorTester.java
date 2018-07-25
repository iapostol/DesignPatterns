package behavioral.mediator;

import behavioral.mediator.chat.mediators.ChatMediator;
import behavioral.mediator.chat.mediators.MessengerMediator;
import behavioral.mediator.chat.colleagues.User;
import behavioral.mediator.chat.colleagues.Human;
import org.junit.Test;

public class ChatMediatorTester {

    @Test
    public void test() {

        ChatMediator mediator = new MessengerMediator();

        User user1 = new Human(mediator, "John");
        User user2 = new Human(mediator, "Lisa");
        User user3 = new Human(mediator, "Anne");
        User user4 = new Human(mediator, "David");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
