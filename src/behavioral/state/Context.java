package behavioral.state;

public class Context {

    public State getState() {
        return state;
    }

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("State: " + state.getClass().getSimpleName());
    }
}
