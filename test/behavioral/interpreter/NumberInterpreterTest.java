package behavioral.interpreter;

import behavioral.interpreter.numbers.Expression;
import behavioral.interpreter.numbers.IntToBinaryExpression;
import behavioral.interpreter.numbers.IntToHexExpression;
import behavioral.interpreter.numbers.InterpreterContext;
import org.junit.Test;

public class NumberInterpreterTest {

    @Test
    public void test() {

        InterpreterContext c = new InterpreterContext();

        Expression expression1 = new IntToBinaryExpression(10);

        Expression expression2 = new IntToHexExpression(10);

        System.out.println(expression1.interpret(c));

        System.out.println(expression2.interpret(c));
    }
}
