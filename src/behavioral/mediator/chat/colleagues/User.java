package behavioral.mediator.chat.colleagues;

import behavioral.mediator.chat.mediators.ChatMediator;

public abstract class User {

    protected ChatMediator mediator;

    protected String name;

    public User(ChatMediator mediator){
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
