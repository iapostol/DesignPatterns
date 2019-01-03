package behavioral.interpreter.expression;

import java.util.Map;

public interface Expression {
    public int interpret(final Map<String, Expression> variables);
}