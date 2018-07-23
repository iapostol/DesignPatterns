package behavioral.interpreter;

import behavioral.interpreter.gof.AbstractExpression;
import behavioral.interpreter.gof.Context;
import behavioral.interpreter.gof.NonTerminalExpression;
import behavioral.interpreter.gof.TerminalExpression;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GofInterpreterTester {
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
