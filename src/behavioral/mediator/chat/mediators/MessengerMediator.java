package behavioral.mediator.chat.mediators;

import behavioral.mediator.chat.colleagues.User;

import java.util.ArrayList;
import java.util.List;

public class MessengerMediator implements ChatMediator {

    private List<User> users;

    public MessengerMediator(){
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users)
            if(u != user)
                u.receive(msg);
    }

}
