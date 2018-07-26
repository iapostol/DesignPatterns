package behavioral.memento.users;

public class UserMemory {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }


    public void setMemento(Memento memento) {

        this.memento = memento;
    }
}
