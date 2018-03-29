package behavioral.interpreter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InterpreterTester {
    @Test
    public void test() {
        Context context = new Context();

        List<AbstractExpression> list = new ArrayList<>();

        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for(AbstractExpression exp : list){
            exp.interpret(context);
        }

    }
}
