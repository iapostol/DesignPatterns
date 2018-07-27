package behavioral.state.mobile;

public class AlertStateContext {

    private MobileAlertState currentState;

    public void setState(MobileAlertState state)
    {
        currentState = state;
    }

    public void alert()
    {
        currentState.alert(this);
    }
}
