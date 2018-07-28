package behavioral.state;

import behavioral.state.mobile.AlertStateContext;
import behavioral.state.mobile.Silent;
import behavioral.state.mobile.Vibration;
import org.junit.Test;

public class MobileStateTester {
    @Test
    public void test() {

        AlertStateContext stateContext = new AlertStateContext();

        stateContext.setState(new Vibration());
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
}
