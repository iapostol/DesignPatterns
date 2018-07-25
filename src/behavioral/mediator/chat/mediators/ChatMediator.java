package behavioral.mediator.chat.mediators;

import behavioral.mediator.chat.colleagues.User;

public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
