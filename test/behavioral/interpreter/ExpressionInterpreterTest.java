package behavioral.interpreter;

import behavioral.interpreter.expression.Evaluator;
import behavioral.interpreter.expression.Expression;
import behavioral.interpreter.expression.Number;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ExpressionInterpreterTest {
    @Test
    public void test() {
        final String expression = "w x z - +";
        final Evaluator sentence = new Evaluator(expression);
        final Map<String, Expression> variables = new HashMap<>();
        variables.put("w", new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));
        final int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
